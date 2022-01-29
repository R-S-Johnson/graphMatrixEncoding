import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

// This is another test change
// I'm making a lot of changes

public class MatrixEncodingApplication extends JPanel{

    Boolean pressed;
    
    
    public void paint(Graphics g) {
        // draw circles
        drawCircles(g);
    }

    private void drawCircles(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(400, 150, 25, 25);
        g.fillOval(150, 350, 25, 25);
        g.fillOval(650, 350, 25, 25);
        g.fillOval(250, 700, 25, 25);
        g.fillOval(550, 700, 25, 25);
    }

    public void setPressed(Boolean b) {
        pressed = b;
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MatrixEncodingApplication panel = new MatrixEncodingApplication();

        Controller controller = new Controller(panel);

        f.add(panel);

        MouseListener mouseListener = new ClickListener(f, controller);
        f.addMouseListener(mouseListener);
        MouseMotionListener mouseMotionListener = new DragListener(f, controller);
        f.addMouseMotionListener(mouseMotionListener);

        f.setSize(Constants.VIEW_WIDTH+22, Constants.VIEW_HEIGHT+22);
        f.setVisible(true);

        controller.start();
        f.repaint();
    }

}
