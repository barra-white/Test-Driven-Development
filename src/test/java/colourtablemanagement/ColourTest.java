package colourtablemanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {
    @Test
    // check if object is null after construction
    void checkIfNull() {
        Colour testColour = new Colour(255, 0, 0);
        assertNotNull(testColour);
    }

    @Test
    // check if constructor is assigning values correctly
    void checkIfCorrectValues() {
        Colour testColour = new Colour(147, 59, 72);
        assertEquals(147, testColour.getRed());
        assertEquals(59, testColour.getGreen());
        assertEquals(72, testColour.getBlue());
    }
}
