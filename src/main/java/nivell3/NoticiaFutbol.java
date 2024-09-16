package nivell3;

public class NoticiaFutbol extends Noticia {

    private String competicio;
    private String club;
    private String nomJugador;

    public NoticiaFutbol(String titular, String text, double puntuacio, double preu, String competicio, String club, String nomJugador) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
        this.nomJugador = nomJugador;
    }

    @Override
    public double calcularPreuNoticia() {
        return 0;
    }
}
