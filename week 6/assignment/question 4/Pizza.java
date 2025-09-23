public class Pizza extends Food {
    @Override
    protected void wash() {
        System.out.println("Washing vegetables for pizza.");
    }

    @Override
    protected void cook() {
        System.out.println("Baking pizza in oven.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving pizza with cheese topping.");
    }
}