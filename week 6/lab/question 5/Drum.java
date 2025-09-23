public class Drum extends Instrument {
    private String type;

    public Drum(String material, String type) {
        super("Drum", material);
        this.type = type;
    }

    @Override
    public void play() {
        System.out.println("Playing Drum of type: " + type);
    }
}