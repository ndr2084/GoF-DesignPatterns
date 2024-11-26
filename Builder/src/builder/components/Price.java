package builder.components;

public record Price(int price) {

    @Override
    public String toString() {
        return String.valueOf(price());
    }

}
