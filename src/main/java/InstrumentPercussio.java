public class InstrumentPercussio extends Instrument {

    private String name;
    private int preu;

    public InstrumentPercussio(String name, int preu) {
        this.name = name;
        this.preu = preu;
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió.");
    }
}
