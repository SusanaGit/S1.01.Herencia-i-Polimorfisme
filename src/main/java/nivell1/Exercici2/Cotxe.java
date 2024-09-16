package nivell1.Exercici2;

public class Cotxe {

    private static final String MARCA = "Golf";
    private static String model = "Hola";
    private final double potencia;


    public Cotxe(double potencia) {
        this.potencia = potencia;
    }

    public static void frenar() {
        System.out.println("El vehicle està frenant.");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant.");
    }
}
