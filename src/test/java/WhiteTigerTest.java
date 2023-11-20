import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Color;

public class WhiteTigerTest {
    @Test
    public void testGetColor() {
        WhiteTiger whiteTiger = new WhiteTiger();
        assertEquals(Color.WHITE, whiteTiger.getColor());
    }

    @Test
    public void testToString() {
        WhiteTiger whiteTiger = new WhiteTiger();
        assertEquals("tgr", whiteTiger.toString());
        assertEquals("TGR", whiteTiger.toString());
    }


}
