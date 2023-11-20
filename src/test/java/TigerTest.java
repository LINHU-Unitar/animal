import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Color;

public class TigerTest {
    @Test
    public void testGetColor() {
        Tiger tiger = new Tiger();
        assertEquals(Color.WHITE, tiger.getColor());
    }

    @Test
    public void testToString() {
        Tiger tiger = new Tiger();
        assertEquals("TGR", tiger.toString());
    }
}
