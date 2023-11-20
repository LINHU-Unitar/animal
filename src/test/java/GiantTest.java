import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Color;

public class GiantTest {
    @Test
    public void testGetColor() {
        Giant giant = new Giant();
        assertEquals(Color.GRAY, giant.getColor());
    }

    @Test
    public void testToString() {
        Giant giant = new Giant();

        giant.moveCount = 0;
        assertEquals("fee", giant.toString());

        giant.moveCount = 6;
        assertEquals("fie", giant.toString());

        giant.moveCount = 12;
        assertEquals("foe", giant.toString());

        giant.moveCount = 18;
        assertEquals("fum", giant.toString());

        giant.moveCount = 24;
        assertEquals("fee", giant.toString());
    }

}
