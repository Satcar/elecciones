import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintChars pc = new PrintChars();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entre 33 y 126 y te voy a dar su correspondiente caracter ASCII: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            char result = pc.printChars(num);
            if (result != 300) {
                System.out.println(result);

            }
        }

        sc.close();
    }
}
