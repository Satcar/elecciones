import java.util.Scanner;

public class Utils {

    public static void showResults(Party[] parties) {
        System.out.println("\n--- RESULTADOS ---");
        for (Party p : parties) {
            int barLength = (int) p.getPercentage();
            System.out.printf("%-10s | ", p.getName());
            for (int i = 0; i < barLength; i++) {
                System.out.print("*");
            }
            System.out.printf(" (%.1f%%)%n", p.getPercentage());
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pressEnter() {
        System.out.println("\nPulsa ENTER para seguir...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
}
