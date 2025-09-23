public class Soup extends Food {
    @Override
    protected void wash() {
        System.out.println("Washing soup ingredients.");
    }

    @Override
    protected void cook() {
        System.out.println("Boiling soup on stove.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving hot soup in a bowl.");
    }

    public static void main(String[] args) {
        Food f1 = new Pizza();
        f1.prepare();
        System.out.println("------------------");
        Food f2 = new Soup();
        f2.prepare();
    }
}
