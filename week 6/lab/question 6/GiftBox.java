// File: GiftBox.java
public class GiftBox extends Box {
    @Override
    public void pack() {
        super.pack(); // preserve original behavior
        System.out.println("Gift wrap added with ribbon.");
    }

    @Override
    public void unpack() {
        super.unpack();
        System.out.println("Gift wrap removed.");
    }

    public static void main(String[] args) {
        GiftBox g = new GiftBox();
        g.pack();
        g.unpack();
    }
}
