public class AdvancedMath extends BasicMath {
    public double calculate(double a, double b, double c) {
        return a * b * c;
    }

    public double calculate(double a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        AdvancedMath m = new AdvancedMath();
        System.out.println("Add ints: " + m.calculate(3, 4));
        System.out.println("Add doubles: " + m.calculate(2.5, 3.5));
        System.out.println("Add 3 ints: " + m.calculate(1, 2, 3));
        System.out.println("Multiply doubles: " + m.calculate(2.0, 3.0, 4.0));
        System.out.println("Power: " + m.calculate(2.0, 3));
    }
}
