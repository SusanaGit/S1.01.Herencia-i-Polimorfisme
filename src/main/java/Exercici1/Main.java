package Exercici1;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static Scanner nombreInstrumentoScanner = new Scanner(System.in);
    static Scanner precioInstrumentoScanner = new Scanner(System.in);


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

                    if (!instrumentVentCreat) {
                        System.out.println("Afegeix el nom de l'instrument de vent: ");
                        String nomInstrumentVent = nombreInstrumentoScanner.nextLine();

                        System.out.println("Quin preu té?");
                        int preuInstrumentVent = precioInstrumentoScanner.nextInt();

                        Instrument instrumentVent = new InstrumentVent(nomInstrumentVent, preuInstrumentVent);

                        instrumentVent.tocar();

                        instrumentVentCreat = true;
                    } else {
                        System.out.println("Ja s'ha creat un instrument de vent.");
                    }

                    break;

                case "B":

                    if (!instrumentPercussioCreat) {
                        System.out.println("Afegeix el nom de l'instrument de percussió: ");
                        String nomInstrumentPercussio = nombreInstrumentoScanner.nextLine();

                        System.out.println("Quin preu té?");
                        int preuInstrumentPercussio = precioInstrumentoScanner.nextInt();

                        Instrument instrumentPercussio = new InstrumentPercussio(nomInstrumentPercussio, preuInstrumentPercussio);
                        instrumentPercussio.tocar();

                        instrumentPercussioCreat = true;
                    } else {
                        System.out.println("Ja s'ha creat un instrument de percussió.");
                    }


                    break;

                case "C":
                    if (!instrumentCordaCreat) {
                        System.out.println("Afegeix el nom de l'instrument de corda: ");
                        String nomInstrumentCorda = nombreInstrumentoScanner.nextLine();

                        System.out.println("Quin preu té?");
                        int preuInstrumentCorda = precioInstrumentoScanner.nextInt();

                        Instrument instrumentCorda = new InstrumentCorda(nomInstrumentCorda, preuInstrumentCorda);
                        instrumentCorda.tocar();

                        instrumentCordaCreat = true;
                    } else {
                        System.out.println("Ja s'ha creat un instrument de corda.");
                    }


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
