import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("MENU:");
            System.out.println("1. Mostrar letras y convertir número ASCII a caracter");
            System.out.println("2. Resultados de elecciones");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion (1-3): ");

            String option = sc.nextLine();

            switch (option) {
                case "1":
                    runPrintChars(sc);
                    break;
                case "2":
                    runElectionResults(sc);
                    break;
                case "3":
                    keepRunning = false;
                    System.out.println("Chaooo!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            if (keepRunning) {
                System.out.println("\n---");
                System.out.println("Volviendo al menu...");
                Utils.pressEnter();
                Utils.clearScreen();
            }
        }

        sc.close();
    }

    private static void runPrintChars(Scanner sc) {
        PrintChars pc = new PrintChars();
        pc.printChars();

        System.out.print("\nIntroduce un numero entre 33 y 126 y te voy a dar su correspondiente caracter ASCII: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            sc.nextLine();
            char result = pc.printChars(num);
            if (result != 300) {
                System.out.println("El caracter correspondiente es: " + result);
            }
        } else {
            System.out.println("Eso no es un numero valido.");
            sc.nextLine();
        }
    }

    private static void runElectionResults(Scanner sc) {
        Party[] parties = {
                new Party("PartidoA"),
                new Party("PartidoB"),
                new Party("PartidoC"),
                new Party("PartidoD"),
                new Party("PartidoE")
        };

        boolean repeat = true;
        while (repeat) {
            double totalPercentage = 0;

            for (Party p : parties) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.printf("Introduce el porcentaje de votos para %s: ", p.getName());
                    if (sc.hasNextDouble()) {
                        double percent = sc.nextDouble();
                        if (percent >= 0 && percent <= 100) {
                            p.setPercentage(percent);
                            totalPercentage += percent;
                            validInput = true;
                        } else {
                            System.out.println("Porcentaje no valido, debe estar entre 0 y 100.");
                        }
                    } else {
                        System.out.println("Eso no es un numero valido.");
                        sc.next();
                    }
                }
            }
            sc.nextLine();

            if (totalPercentage > 100) {
                System.out.println("\n⚠️ La suma de porcentajes supera el 100%!");
            }

            Utils.clearScreen();
            Utils.showResults(parties);
            Utils.pressEnter();

            System.out.print("¿Actualizar resultados? (S/N): ");
            char answer = sc.nextLine().trim().toUpperCase().charAt(0);
            repeat = (answer == 'S');
            Utils.clearScreen();
        }

        System.out.println("hasta la proxima!");
    }
}
