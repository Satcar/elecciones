public class PrintChars {

    public void printChars() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%d: %c%n", (int) c, c);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.printf("%d: %c%n", (int) c, c);
        }
    }

    public char printChars(int number) {
        if (number >= 33 && number <= 126) {
            return (char) number;
        } else {
            System.out.println("El numero debe estar entre 33 y 126.");
            return 300;
        }
    }
}
