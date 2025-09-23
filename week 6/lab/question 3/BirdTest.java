public class BirdTest {
    public static void main(String[] args) {
        Bird[] birds = { new Bird(), new Penguin(), new Eagle() };
        for (Bird b : birds) {
            b.fly();  // polymorphism
        }
    }
}
