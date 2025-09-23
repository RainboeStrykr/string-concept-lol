public class LED extends Light {
    private int power;

    public LED() {
        this(60, "Warm White", 5);
        System.out.println("LED default constructor");
    }

    public LED(int brightness, String color, int power) {
        super(brightness, color); // chain to parent
        this.power = power;
        System.out.println("LED constructor with all parameters");
    }

    public static void main(String[] args) {
        new LED();
        System.out.println("------------------");
        new LED(80, "Cool White", 10);
    }
}
