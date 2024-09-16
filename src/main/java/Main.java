public class Main {

    public static void main(String[] args) {

        InstrumentVent flauta = new InstrumentVent("flauta", 10);

        flauta.tocar();

        InstrumentPercussio timbal = new InstrumentPercussio("timbal", 20);

        timbal.tocar();

        InstrumentCorda guitarra = new InstrumentCorda("guitarra", 30);

        guitarra.tocar();

    }

}
