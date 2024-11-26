package builder.components;

public class Bedrooms {
    private final int master;
    private final int guest;
    private final int kids;

    public Bedrooms(int master, int guest, int kids){
        this.master = master;
        this.guest = guest;
        this.kids = kids;
    }
    @Override
    public String toString() {
        return "{" + "master=" + master + ", guest=" + guest + ", kids=" + kids + '}';
    }
}
