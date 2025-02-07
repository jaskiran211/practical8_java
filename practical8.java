public class Practical8 {

    void pattern(int size, int line, int star) {
        if (line > 2 * size + 1) {
            return;
        }

        int starsInLine;
        if (line <= size + 1) {
            starsInLine = line;
        } else {
            starsInLine = 2 * size + 2 - line;
        }

        if (star <= starsInLine) {
            System.out.print("*");
            pattern(size, line, star + 1);
        } else {
            System.out.println();
            pattern(size, line + 1, 1);
        }
    }

    void pattern2(int size) {
        printStars(1, size);
        printPluses(size + 1);
        printSlashes(size, size);
    }

    void printStars(int line, int size) {
        if (line > size) return;
        printSpaces(size - line);
        printChars('*', line);
        System.out.println();
        printStars(line + 1, size);
    }

    void printPluses(int count) {
        if (count == 0) {
            System.out.println();
            return;
        }
        System.out.print("+");
        printPluses(count - 1);
    }

    void printSlashes(int line, int size) {
        if (line == 0) return;
        printSpaces(size - line);
        printChars('/', line);
        System.out.println();
        printSlashes(line - 1, size);
    }

    void printSpaces(int count) {
        if (count == 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    void printChars(char ch, int count) {
        if (count == 0) return;
        System.out.print(ch);
        printChars(ch, count - 1);
    }

    void diamondPattern(int size, int line) {
        if (line > 2 * size - 1) return;
        int spaces;
        int stars;
        if (line <= size) {
            spaces = size - line;
            stars = 2 * line - 1;
        } else {
            spaces = line - size;
            stars = 2 * (2 * size - line) - 1;
        }
        printSpaces(spaces);
        printChars('*', stars);
        System.out.println();
        diamondPattern(size, line + 1);
    }

    void plusPattern(int size, int count) {
        if (count == 0) return;
        printSpaces(size - 1);
        System.out.println("+");
        plusPattern(size, count - 1);
    }

    public static void main(String[] args) {
        Practical8 p = new Practical8();
        p.pattern(3, 1, 1);
        p.pattern2(4);
        p.diamondPattern(5, 1);
        p.plusPattern(4, 4);
    }
}
