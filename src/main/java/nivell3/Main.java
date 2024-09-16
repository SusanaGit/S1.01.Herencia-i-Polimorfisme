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
                    System.out.println("Introdueix el dni del redactor al que vols afegir la notícia: ");
                    String dniRedactorNoticia = keyboard.nextLine();

                    if (redaccio.buscarRedactor(dniRedactorNoticia) > -1) {

                        System.out.println("Escull el tipus de notícia: ");
                        System.out.println("1. Bàsquet");
                        System.out.println("2. F1");
                        System.out.println("3. Futbol");
                        System.out.println("4. Motociclisme");
                        System.out.println("5. Tenis");
                        String tipusNoticia = keyboard.nextLine();

                        System.out.println("Titular de la notícia: ");
                        String titular = keyboard.nextLine();

                        System.out.println("Text de la notícia: ");
                        String text = keyboard.nextLine();

                        System.out.println("Puntuació de la notícia: ");
                        Double puntuacio = keyboard.nextDouble();

                        System.out.println("Preu de la notícia: ");
                        Double preuNoticia = keyboard.nextDouble();

                        keyboard.nextLine();

                        switch(tipusNoticia) {
                            case ("1"):
                                System.out.println("BÀSQUET");
                                System.out.println("Introdueix la competició: ");
                                String competicio = keyboard.nextLine();

                                System.out.println("Introdueix el club: ");
                                String club = keyboard.nextLine();

                                Noticia novaNoticiaBasquet = new NoticiaBasquet(titular, text, puntuacio, preuNoticia, competicio, club);

                                redaccio.getRedactors().get(redaccio.buscarRedactor(dniRedactorNoticia)).afegirNoticia(novaNoticiaBasquet);

                                System.out.println("Nova notícia de basquet afegida.");

                                break;
                            case("2"):
                                System.out.println("F1");
                                System.out.println("Introdueix l'escuderia: ");
                                String escuderia = keyboard.nextLine();

                                Noticia novaNoticiaF1 = new NoticiaF1(titular, text, puntuacio, preuNoticia, escuderia);

                                redaccio.getRedactors().get(redaccio.buscarRedactor(dniRedactorNoticia)).afegirNoticia(novaNoticiaF1);

                                System.out.println("Nova notícia de F1 afegida.");

                                break;
                            case("3"):
                                System.out.println("FUTBOL");
                                System.out.println("Introdueix la competició: ");
                                String competicioFutbol = keyboard.nextLine();

                                System.out.println("Introdueix el club: ");
                                String clubFutbol = keyboard.nextLine();

                                System.out.println("Introdueix el nom del jugador: ");
                                String nomJugadorFutbol = keyboard.nextLine();

                                Noticia novaNoticiaFutbol = new NoticiaFutbol(titular, text, puntuacio, preuNoticia, competicioFutbol, clubFutbol, nomJugadorFutbol);

                                redaccio.getRedactors().get(redaccio.buscarRedactor(dniRedactorNoticia)).afegirNoticia(novaNoticiaFutbol);

                                System.out.println("Nova notícia de Futbol afegida.");
                                break;
                            case("4"):
                                System.out.println("MOTOCICLISME");
                                System.out.println("Introdueix l'equip: ");
                                String equipMotociclisme = keyboard.nextLine();

                                Noticia novaNoticiaMoto = new NoticiaMotociclisme(titular, text, puntuacio, preuNoticia, equipMotociclisme);

                                redaccio.getRedactors().get(redaccio.buscarRedactor(dniRedactorNoticia)).afegirNoticia(novaNoticiaMoto);

                                System.out.println("Nova noticia de Motociclisme afegida.");
                                break;
                            case("5"):
                                System.out.println("TENIS");
                                System.out.println("Introdueix la competició de tenis: ");
                                String competicioTenis = keyboard.nextLine();

                                System.out.println("Introdueix els tenistes: ");
                                String tenistes = keyboard.nextLine();

                                Noticia novaNoticiaTenis = new NoticiaTenis(titular, text, puntuacio, preuNoticia, competicioTenis, tenistes);

                                redaccio.getRedactors().get(redaccio.buscarRedactor(dniRedactorNoticia)).afegirNoticia(novaNoticiaTenis);

                                System.out.println("Nova noticia de Tenis afegida.");

                                break;
                            default:
                                System.out.println("L'opció no es troba al menú.");
                                break;
                        }
                    }


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
                    System.out.println("L'opció no es troba al menú. Torna-hi.");
                    break;
            }
        }
    }
}
