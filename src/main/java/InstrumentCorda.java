public class InstrumentCorda extends Instrument {

    private String name;
    private int preu;

    public InstrumentCorda(String name, int preu) {
        this.name = name;
        this.preu = preu;
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda.");
    }
}
