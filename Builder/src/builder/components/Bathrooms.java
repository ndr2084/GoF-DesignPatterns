package builder.components;

public class Bathrooms {
    private final int halfBathroom;
    private final int fullBathroom;
    private final int quarterBathroom;
    private final int threeQuarterBathroom;

    public Bathrooms(int halfBathroom, int fullBathroom, int quarterBathroom, int threeQuarterBathroom){
        this.halfBathroom = halfBathroom;
        this.fullBathroom = fullBathroom;
        this.quarterBathroom = quarterBathroom;
        this.threeQuarterBathroom = threeQuarterBathroom;
    }

    @Override
    public String toString() {
        return "{" + "halfBathroom=" + halfBathroom + ", fullBathroom=" + fullBathroom + ", quarterBathroom=" + quarterBathroom + ", threeQuarterBathroom=" + threeQuarterBathroom + '}';
    }


}
