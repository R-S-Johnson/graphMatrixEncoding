import java.awt.Panel;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends Panel {



    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(0, 0, Constants.VIEW_HEIGHT, Constants.VIEW_WIDTH);
    }

    public void drawCircles(Graphics graphics) {
        graphics.setColor(Color.CYAN);
        graphics.drawOval(400, 150, 25, 25);
        graphics.drawOval(150, 350, 25, 25);
        graphics.drawOval(650, 350, 25, 25);
        graphics.drawOval(250, 700, 25, 25);
        graphics.drawOval(550, 700, 25, 25);
    }

    public void drawMouseLine(int i, int[] mousePosition) {
    }

    public void drawConnectionLine(int i, int j) {
    }

}
