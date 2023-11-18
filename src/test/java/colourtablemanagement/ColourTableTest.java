package colourtablemanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTableTest {

    @Test
    // check if object is not null after initialisation
    void checkIfNull() {
        ColourTable testTable = new ColourTable(8);
        assertNotNull(testTable);
    }

    @Test
    // check if colour table size meets requirements (is a power of 2 and less than 1025)
    void checkIfCorrectPaletteSize () {
        ColourTable test1 = new ColourTable(2);
        ColourTable test2 = new ColourTable(8);

        // checks to see if size satisfies requirements array of that size is created
        assertEquals(2, test1.getPaletteSize());
        assertEquals(8, test2.getPaletteSize());

        // checks if exception is thrown for invalid palette sizes
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(0));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(10000));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(7));
    }

    @Test
    // check if exception is thrown if colourTable is called without a palette size
    void checkForPaletteSizeInput() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable());
    }

    @Test
    // test method to count number of empty spaces in colour palette
    void checkForEmptyPaletteSpace () {
        ColourTable test = new ColourTable(1024);
        assertEquals(test.getPaletteSize(), test.getFreePaletteSpace());
        assertEquals(1024, test.getFreePaletteSpace());
    }

}
