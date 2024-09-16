package nivell3;

public class NoticiaMotociclisme extends Noticia {

    private String equip;

    public NoticiaMotociclisme(String titular, String text, double puntuacio, double preu, String equip) {
        super(titular, text, puntuacio, preu);
        this.equip = equip;
    }

    @Override
    public double calcularPreuNoticia() {
        return 0;
    }
}
