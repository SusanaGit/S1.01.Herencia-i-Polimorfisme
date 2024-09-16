package nivell3;

import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Redaccio redaccio = new Redaccio();

        while (true) {
            System.out.println("Tria l'opció que vulguis: ");
            System.out.println("1. Introduir redactor");
            System.out.println("2. Eliminar redactor");
            System.out.println("3. Introduir notícia a un redactor");
            System.out.println("4. Eliminar notícia");
            System.out.println("5. Mostrar totes les notícies per redactor");
            System.out.println("6. Calcular puntuació de la notícia");
            System.out.println("7. Calcular el preu de la notícia");
            System.out.println("X. Sortir");
            String opcio = keyboard.nextLine();

            switch (opcio) {
                case ("1"):
                    System.out.println("Introdueix el nom del redactor: ");
                    String nomRedactor = keyboard.nextLine();

                    System.out.println("Introdueix el dni del redactor: ");
                    String dni = keyboard.nextLine();

                    Redactor nouRedactor = new Redactor(dni, nomRedactor);
                    redaccio.afegirRedactor(nouRedactor);
                    redaccio.imprimirLlistatRedactors();

                    break;
                case ("2"):
                    System.out.println("Introdueix el dni del redactor que vols esborrar: ");
                    String dniRedactor = keyboard.nextLine();

                    redaccio.esborrarRedactor(dniRedactor);
                    redaccio.imprimirLlistatRedactors();

                    break;
                case ("3"):


                    break;
                case ("4"):
                    break;
                case ("5"):
                    break;
                case ("6"):
                    break;
                case ("7"):
                    break;
                case ("X"):
                    System.out.println("Fins aviat.");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
