import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BearTest {
    @Test
    public void testGetColor() {
        Bear bear = new Bear(true);
        assertEquals(Color.WHITE, bear.getColor());
    }

    @Test
    public void testToString() {
        Bear bear = new Bear(true);
        bear.moveCount = 0;
        assertEquals("/", bear.toString());

        bear.moveCount = 1;
        assertEquals("\\", bear.toString());
    }
}
