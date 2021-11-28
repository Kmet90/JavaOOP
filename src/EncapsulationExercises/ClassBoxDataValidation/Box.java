package EncapsulationExercises.ClassBoxDataValidation;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        validateParameter("Length", length);
        this.length = length;
    }

    private void setWidth(double width) {
        validateParameter("Width", width);
        this.width = width;
    }

    private void setHeight(double height) {
        validateParameter("Height", height);
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return (2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * this.height);
//        2lw + 2lh + 2wh
    }

    public double calculateLateralSurfaceArea() {
        return (2 * length * height) + (2 * width * height);
//        2lh + 2wh
    }

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }

    private void validateParameter(String prefix, double param) {
        if (param <= 0) {
            throw new IllegalArgumentException(prefix + " cannot be zero or negative.");
        }
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                        "Lateral Surface Area - %.2f%n" +
                        "Volume – %.2f",
                this.calculateSurfaceArea(),
                this.calculateLateralSurfaceArea(),
                this.calculateVolume());
    }
}
