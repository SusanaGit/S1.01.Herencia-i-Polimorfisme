package nivell3;

public abstract class Noticia {

    private String titular;
    private String text = "";
    private double puntuacio;
    private double preu;

    public Noticia(String titular, String text, double puntuacio, double preu) {
        this.titular = titular;
        this.text = text;
        this.puntuacio = puntuacio;
        this.preu = preu;
    }

    public abstract double calcularPreuNoticia();
}
