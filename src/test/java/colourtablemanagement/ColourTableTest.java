package colourtablemanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTableTest {
    @Test
        // check if object is null after construction
    void checkIfNull() {
        ColourTable testTable = new ColourTable(10);
        assertNotNull(testTable);
    }
}
