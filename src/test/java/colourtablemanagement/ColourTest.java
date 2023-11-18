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
}
