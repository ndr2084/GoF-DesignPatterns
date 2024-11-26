package builder.components;

import java.util.ArrayList;

public class Location {
    private final ArrayList<String> location = new ArrayList<>();

    public Location(String state, String county, String zipcode) {
        location.add(state);
        location.add(county);
        location.add(zipcode);
    }
    @Override
    public String toString() {
        return String.join(", ", location);
    }


}
