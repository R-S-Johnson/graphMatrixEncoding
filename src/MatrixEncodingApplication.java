import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MatrixEncodingApplication extends JFrame{
    
    MatrixEncodingApplication() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Controller controller = new Controller();
        add(controller.getPanel());

        MouseListener mouseListener = new ClickListener(this, controller);
        addMouseListener(mouseListener);
        MouseMotionListener mouseMotionListener = new DragListener(this, controller);
        addMouseMotionListener(mouseMotionListener);

        setSize(Constants.VIEW_WIDTH+22, Constants.VIEW_HEIGHT+22);
        setVisible(true);

        setFocusable(true);

        controller.start();
    }

    public static void main(String[] args) {
        MatrixEncodingApplication a = new MatrixEncodingApplication();
        a.repaint();
    }

}
