import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Container;

public class DragListener implements MouseMotionListener {

    private Container parent;
    private Controller controller;


    DragListener(Container parent, Controller controller) {
        this.parent = parent;
        this.controller = controller;
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO remove (testing)
        System.out.println("mouseDragged called");
    }


    /// Not needed ///

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
