package colourtablemanagement;

public class Colour {
    // variables for red, green and blue values
    private int red;
    private int green;
    private int blue;

    // constructor
    public Colour(int red, int green, int blue) {
        this.red = this.validateRange(red);
        this.green = this.validateRange(green);
        this.blue = this.validateRange(blue);
    }

    // get methods for each of the RGB values
    public int getRed() {
        return this.red;
    }
    public int getGreen() {
        return this.green;
    }
    public int getBlue() {
        return this.blue;
    }

    // method to check if inputted RGB values are in required range
    // returns value if in range, else throws InvalidArgumentException
    public int validateRange(int value) {
        if (value >= 0 && value <= 255) {
            return value;
        }
        else {
            throw new IllegalArgumentException("RGB Values must be between 0 and 255");
        }
    }
}
