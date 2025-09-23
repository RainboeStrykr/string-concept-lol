public class Guitar extends Instrument {
    private int strings;

    public Guitar(String material, int strings) {
        super("Guitar", material);
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Playing Guitar with " + strings + " strings");
    }
}