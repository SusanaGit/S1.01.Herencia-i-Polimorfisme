package nivell3;

public class NoticiaTenis extends Noticia {

    private String competicio;
    private String tenistes;

    public NoticiaTenis(String titular, String text, double puntuacio, double preu, String competicio, String tenistes) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    @Override
    public double calcularPreuNoticia() {
        return 0;
    }
}
