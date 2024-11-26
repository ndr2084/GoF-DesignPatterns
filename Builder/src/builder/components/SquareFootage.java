package builder.components;

public record SquareFootage(int squareFootage) {

    @Override
    public String toString() {
        return String.valueOf(squareFootage());
    }
}
