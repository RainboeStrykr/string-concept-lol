public class Hammer extends Tool {
    private String material = "Steel";
    public void showAccess() {
        System.out.println("Tool ID (via getter): " + getId());
        System.out.println("Tool Type (protected): " + type);
        System.out.println("Tool Name (public): " + name);
        System.out.println("Hammer material: " + material);
    }
    public static void main(String[] args) {
        Hammer h = new Hammer();
        h.showAccess();
    }
}
