package builder.houses;

import builder.components.BuildingCompany;
import builder.components.SquareFootage;
import builder.components.Location;
import builder.components.Price;
import builder.components.Bathrooms;
import builder.components.Bedrooms;

public record House(HouseType houseType, Bathrooms bathrooms, Bedrooms bedrooms, BuildingCompany buildingCompany,
                    Location location, Price price, SquareFootage squareFootage) {
}
