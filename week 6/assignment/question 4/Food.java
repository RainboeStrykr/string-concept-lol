public abstract class Food {
    // Template method
    public final void prepare() {
        wash();
        cook();
        serve();
    }

    protected abstract void wash();
    protected abstract void cook();
    protected abstract void serve();
}