package Exercici1;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        boolean instrumentVentCreat = false;
        boolean instrumentPercussioCreat = false;
        boolean instrumentCordaCreat = false;

        while (!instrumentVentCreat || !instrumentPercussioCreat || !instrumentCordaCreat) {

            System.out.println("Quin instrument vols crear?");
            System.out.println("A: Instrument de vent");
            System.out.println("B: Instrument de percussió");
            System.out.println("C: Instrument de corda");
            System.out.println("X: Tanca l'aplicació");

            String eleccion = keyboard.nextLine();

            switch (eleccion) {

                case "A":

                    System.out.println("Afegeix el nom de l'instrument de vent: ");
                    String nomInstrumentVent = keyboard.nextLine();

                    System.out.println("Quin preu té?");
                    int preuInstrumentVent = keyboard.nextInt();

                    Instrument instrumentVent = new InstrumentVent(nomInstrumentVent, preuInstrumentVent);

                    instrumentVent.tocar();

                    instrumentVentCreat = true;

                    break;

                case "B":

                    System.out.println("Afegeix el nom de l'instrument de percussió: ");
                    String nomInstrumentPercussio = keyboard.nextLine();

                    System.out.println("Quin preu té?");
                    int preuInstrumentPercussio = keyboard.nextInt();

                    Instrument instrumentPercussio = new InstrumentPercussio(nomInstrumentPercussio, preuInstrumentPercussio);
                    instrumentPercussio.tocar();

                    instrumentPercussioCreat = true;

                    break;

                case "C":

                    System.out.println("Afegeix el nom de l'instrument de corda: ");
                    String nomInstrumentCorda = keyboard.nextLine();

                    System.out.println("Quin preu té?");
                    int preuInstrumentCorda = keyboard.nextInt();

                    Instrument instrumentCorda = new InstrumentCorda(nomInstrumentCorda, preuInstrumentCorda);
                    instrumentCorda.tocar();

                    instrumentCordaCreat = true;

                    break;

                case "X":

                    System.out.println("Tancant l'aplicació. Fins aviat.");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Opció invàlida. Torna-hi.");
            }

        }

    }

}
