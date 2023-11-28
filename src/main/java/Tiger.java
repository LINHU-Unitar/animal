
import java.awt.Color;
import java.util.Random;

public class Tiger extends Critter {
    private int moveCount = 0;
    private Color currentColor;
    public Tiger() {
        super();
        changeColor();
    }

    @Override
    public Color getColor() {
        if (moveCount % 3 == 0) changeColor();
        return currentColor;
    }

    private void changeColor() {
        Random random = new Random();
        Color[] colors = {Color.white, Color.GREEN, Color.blue};

        // 生成一个随机索引，范围在0到2之间（包括0和2）
        int randomIndex = random.nextInt(3);

        // 根据随机索引选择颜色
        currentColor = colors[randomIndex];
    }

    @Override
    public String toString() {
        return "TGR";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
