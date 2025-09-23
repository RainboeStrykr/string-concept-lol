public class CardGame extends Game {
    private int numberOfPlayers;

    public CardGame(String name, int numberOfPlayers) {
        super(name);
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return super.toString() + " | CardGame with " + numberOfPlayers + " players";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof CardGame)) return false;
        CardGame c = (CardGame) obj;
        return this.numberOfPlayers == c.numberOfPlayers;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + numberOfPlayers;
    }

    public static void main(String[] args) {
        CardGame c1 = new CardGame("Poker", 4);
        CardGame c2 = new CardGame("Poker", 4);
        CardGame c3 = new CardGame("Bridge", 2);

        System.out.println(c1);
        System.out.println(c1.equals(c2)); // true
        System.out.println(c1.equals(c3)); // false
    }
}
