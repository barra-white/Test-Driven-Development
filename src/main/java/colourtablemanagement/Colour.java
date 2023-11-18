package colourtablemanagement;

public class Colour {
    // variables for red, green and blue values
    private int red;
    private int green;
    private int blue;

    // constructor
    public Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
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
}
