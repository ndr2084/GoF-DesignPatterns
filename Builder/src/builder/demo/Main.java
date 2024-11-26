package builder.demo;

import builder.builders.HouseBuilder;
import builder.components.*;
import builder.houses.House;
import builder.houses.HouseDocuments;
import builder.houses.HouseType;

public class Main {
    public static void main(String[] args) {

        HouseBuilder houseBuilder = new HouseBuilder();

        Bathrooms bathrooms = new Bathrooms(2, 1, 0, 0 );
        Bedrooms bedrooms = new Bedrooms(1, 2, 2 );
        BuildingCompany buildingCompany = BuildingCompany.COMPANY_1;
        SquareFootage squareFootage = new SquareFootage(2000);
        Location location = new Location("Virginia", "Fairfax", "22042");
        Price price = new Price(5000000);

        houseBuilder.setBathrooms(bathrooms);
        houseBuilder.setBedrooms(bedrooms);
        houseBuilder.setCompany(buildingCompany);
        houseBuilder.setSquareFootage(squareFootage);
        houseBuilder.setLocation(location);
        houseBuilder.setPrice(price);
        houseBuilder.setHouseType(HouseType.HOUSE);

        House house = houseBuilder.getHouse();
        HouseDocuments houseDocuments = new HouseDocuments(house);
        System.out.println(houseDocuments.createDocument());

    }
}