package nivell3;

public class NoticiaF1 extends Noticia {

    private String escuderia;

    public NoticiaF1(String titular, String text, double puntuacio, double preu, String escuderia) {
        super(titular, text, puntuacio, preu);
        this.escuderia = escuderia;
    }

    @Override
    public double calcularPreuNoticia() {
        return 0;
    }
}
