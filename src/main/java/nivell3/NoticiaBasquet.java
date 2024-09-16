package nivell3;

public class NoticiaBasquet extends Noticia {

    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, String text, double puntuacio, double preu, String competicio, String club) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public double calcularPreuNoticia() {
        return 0;
    }
}
