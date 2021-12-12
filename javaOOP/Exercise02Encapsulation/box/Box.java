package Exercise02Encapsulation.box;

public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width) {
        this.setLength(length);
        this.setHeight(height);
        this.setWidth(width);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative");
        }
        this.length = length;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Weight cannot be zero or negative");
        }
        this.height = height;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative");
        }
        this.width = width;
    }

    public double calculateVolume() {
        return length * height * width;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

}
