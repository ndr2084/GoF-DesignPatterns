package builder.houses;

public class HouseDocuments {
    House house = null;

    public HouseDocuments(House house) {
        this.house = house;
    }

    public String createDocument() {
        if (this.house != null) {
            return toString();
        }
        else {
            return "Error: No house was created";
        }
    }

    @Override
    public String toString() {
        return "The buyer has shown interested in a " + house.houseType() + "\n" +
                "Bathroom Specifications: " + house.bathrooms() + "\n" +
                "Bedroom Specifications: " + house.bedrooms() + "\n" +
                "Company specifications: " + house.buildingCompany() + "\n" +
                "Location specifications: " + house.location() + "\n" +
                "Price point specifications: " + house.price() + ".\n" +
                "Square footage specifications: " + house.squareFootage() + "\n";
    }
}
