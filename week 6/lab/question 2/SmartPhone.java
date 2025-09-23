public class SmartPhone extends Phone {
    private String operatingSystem;

    public SmartPhone(String brand, String model, String operatingSystem) {
        super(brand, model);  // calls parent constructor
        this.operatingSystem = operatingSystem;
        System.out.println("SmartPhone constructor: OS = " + operatingSystem);
    }

    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("Apple", "iPhone 15", "iOS");
        SmartPhone s2 = new SmartPhone("Samsung", "Galaxy S24", "Android");
    }
}
