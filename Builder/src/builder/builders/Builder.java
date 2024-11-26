package builder.builders;

import builder.components.*;
import builder.houses.House;
import builder.houses.HouseType;

public interface Builder {

    void setHouseType(HouseType type);

    void setBathrooms(Bathrooms bathrooms);

    void setBedrooms(Bedrooms bedrooms);

    void setCompany(BuildingCompany company);

    void setLocation(Location location);

    void setPrice(Price price);

    void setSquareFootage(SquareFootage squareFootage);

}
