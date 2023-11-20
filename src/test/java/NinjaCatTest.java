import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Color;

public class NinjaCatTest {
    @Test
    public void testGetColor() {
        NinjaCat ninjaCat = new NinjaCat();

        // 颜色交替测试
        assertEquals(Color.RED, ninjaCat.getColor());
        assertEquals(Color.BLUE, ninjaCat.getColor());
        assertEquals(Color.RED, ninjaCat.getColor());
        assertEquals(Color.BLUE, ninjaCat.getColor());
        // 可以继续添加更多颜色测试
    }

    @Test
    public void testToString() {
        NinjaCat ninjaCat = new NinjaCat();
        assertEquals("NC", ninjaCat.toString());
    }

}
