public class Light {
    private int brightness;
    private String color;

    public Light() {
        this(50, "White"); // chain to another constructor
        System.out.println("Light default constructor");
    }

    public Light(int brightness) {
        this(brightness, "White");
        System.out.println("Light constructor with brightness only");
    }

    public Light(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
        System.out.println("Light constructor with brightness & color");
    }
}