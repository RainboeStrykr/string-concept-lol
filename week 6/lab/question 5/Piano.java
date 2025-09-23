public class Piano extends Instrument {
    private int keys;

    public Piano(String material, int keys) {
        super("Piano", material);
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println("Playing Piano with " + keys + " keys");
    }
}