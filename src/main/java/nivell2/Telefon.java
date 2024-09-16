package nivell2;

public class Telefon {

    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numTelefon) {
        System.out.println("S'està trucant al número " + numTelefon);
    }

}
