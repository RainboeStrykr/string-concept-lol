// File: Apple.java
public class Apple extends Fruit {
    private String variety;

    public Apple(String color, String taste, String variety) {
        super(color, taste);
        this.variety = variety;
    }

    public void showDetails() {
        System.out.println("Apple variety: " + variety + ", Color: " + color + ", Taste: " + taste);
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet", "Fuji");
        apple.showDetails();
    }
}