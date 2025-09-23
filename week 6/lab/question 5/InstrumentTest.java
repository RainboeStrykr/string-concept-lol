public class InstrumentTest {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano("Wood", 88),
            new Guitar("Metal", 6),
            new Drum("Plastic", "Bass Drum")
        };

        for (Instrument i : instruments) {
            i.play();
        }
    }
}