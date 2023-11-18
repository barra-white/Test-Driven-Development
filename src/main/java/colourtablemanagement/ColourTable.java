package colourtablemanagement;

public class ColourTable {
    // variable for colour palette
    private Colour[] colourPalette;

    // constructor
    public ColourTable(int paletteSize) {
        this.colourPalette = new Colour[this.validatePaletteSize(paletteSize)];
    }

    // constructor that throws exception if no size is specified
    public ColourTable() {
        throw new IllegalArgumentException("Must enter a palette size");
    }

    // getter method to return palette size
    public int getPaletteSize() {
        return this.colourPalette.length;
    }

    // get method to get a colour at specified index
    public Colour getColourAtIndex(int index) {
        return this.colourPalette[index];
    }

    // method to add colours to the palette
    public void add(Colour colour) {
        this.colourPalette[0] = colour;
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

    // method to check if a value is to the power of 2 (bitwise operation)
    public boolean isPowerOf2(int size) {
        return (size & (size - 1)) == 0;
    }

    // method to count number of empty space in palette
    public int getFreePaletteSpace() {
        int spaceCounter = 0;
        for (Colour col : colourPalette) {
            if (col == null) {
                spaceCounter++;
            }
        }
        return spaceCounter;
    }
}
