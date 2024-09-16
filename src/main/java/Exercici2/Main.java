package Exercici2;

public class Main {

    public static void main(String[] args) {

        Cotxe cotxe1 = new Cotxe(23);

        // crida mètode estàtic
        Cotxe.frenar();

        // crida mètode no estàtic
        cotxe1.accelerar();
    }

}
