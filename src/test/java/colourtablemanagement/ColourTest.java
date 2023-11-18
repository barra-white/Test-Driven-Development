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

    @Test
    // check if inputted values are in specified range
    void checkIfInRange() {
        Colour testColour = new Colour(155, 156, 157);

        // checks to see if assigns correctly when values in range
        assertEquals(155, testColour.getRed());
        assertEquals(156, testColour.getGreen());
        assertEquals(157, testColour.getBlue());


        // check to see if exception is thrown as red is out of range
        assertThrows(IllegalArgumentException.class, () -> new Colour(256, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Colour(0, -55, 0));
        assertThrows(IllegalArgumentException.class, () -> new Colour(0, 0, 1000));
    }
}
