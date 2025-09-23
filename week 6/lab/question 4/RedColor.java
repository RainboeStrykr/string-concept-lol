public class RedColor extends PrimaryColor {
    private String shade;

    public RedColor(String name, int intensity, String shade) {
        super(name, intensity);
        this.shade = shade;
        System.out.println("RedColor constructor: shade = " + shade);
    }

    public static void main(String[] args) {
        RedColor r = new RedColor("Red", 90, "Dark Red");
    }
}