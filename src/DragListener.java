import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Container;

import javax.swing.JFrame;

public class DragListener implements MouseMotionListener{

    private Container parent;
    private Controller controller;


    public DragListener(JFrame f, Controller controller) {
        parent = f;
        this.controller = controller;
    }


    /**
     * If the mouse is dragged and we have
     * successfully started inside a circle,
     * then we need to tell the controller
     * that it's okay to draw the line
     * between the mouse and the circle
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
