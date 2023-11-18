package colourtablemanagement;

public class ColourTable {
    // variable for colour palette
    private Colour[] colourPalette;

    // constructor
    public ColourTable(int paletteSize) {
        colourPalette = new Colour[this.validatePaletteSize(paletteSize)];
    }

    // getter method to return palette size
    public int getPaletteSize() {
        return this.colourPalette.length;
    }

    // method to validate palette size
    public int validatePaletteSize(int size) {
        if (isPowerOf2(size) && size > 1 && size < 1025) {
            return size;
        }
        else {
            throw new IllegalArgumentException("Palette size must be between 2 and 1024, and must be a power of 2");
        }
    }

    // method to check if a value is to the power of 2
    public boolean isPowerOf2(int size) {
        return (size & (size - 1)) == 0;
    }
}
