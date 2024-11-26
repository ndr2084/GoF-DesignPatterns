package builder.builders;

import builder.components.BuildingCompany;
import builder.houses.House;
import builder.components.*;
import builder.houses.HouseType;

public class HouseBuilder implements Builder {
    HouseType type;
    Bathrooms bathrooms;
    Bedrooms bedrooms;
    BuildingCompany company;
    Location location;
    Price price;
    SquareFootage squareFootage;


    @Override
    public void setHouseType(HouseType type) {
        this.type = type;
    }

    @Override
    public void setBathrooms(Bathrooms bathrooms) { this.bathrooms = bathrooms;}

    @Override
    public void setBedrooms(Bedrooms bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public void setCompany(BuildingCompany company) {
        this.company = company;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public void setSquareFootage(SquareFootage squareFootage) {
        this.squareFootage = squareFootage;
    }

    public House getHouse() {
        return new House(type, bathrooms, bedrooms, company, location, price, squareFootage);
    }
}
