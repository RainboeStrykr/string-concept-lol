public class Tool {
    private String id = "T1001";   // private
    protected String type = "Hand Tool"; // protected
    public String name = "Generic Tool"; // public

    public String getId() {
        return id; // getter for private
    }
}