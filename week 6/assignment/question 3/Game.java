import java.util.Objects;

public class Game {
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Game)) return false;
        Game g = (Game) obj;
        return Objects.equals(this.name, g.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

