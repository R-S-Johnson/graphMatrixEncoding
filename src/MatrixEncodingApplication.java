import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.FlowLayout;


public class MatrixEncodingApplication extends JFrame{
    
    MatrixEncodingApplication() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        Controller controller = new Controller();
        // add(controller.getPanel());
        // TODO remove (debug)
        add(new GamePanel());

        MouseListener mouseListener = new ClickListener(this, controller);
        addMouseListener(mouseListener);
        MouseMotionListener mouseMotionListener = new DragListener(this, controller);
        addMouseMotionListener(mouseMotionListener);

        setSize(Constants.VIEW_WIDTH+22, Constants.VIEW_HEIGHT+22);
        setVisible(true);

        // controller.start();
    }

    public static void main(String[] args) {
        MatrixEncodingApplication a = new MatrixEncodingApplication();
        a.repaint();
    }

}
