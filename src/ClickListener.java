import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Container;

public class ClickListener implements MouseListener {

    private Container parent;
    private Controller controller;


    ClickListener(Container parent, Controller controller) {
        this.parent = parent;
        this.controller = controller;
    }


    /**
     * When the mouse is clicked, we need to
     * determine whether we were in the
     * boundaries of a circle. If yes, then
     * dragging the mouse can draw the line
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        int[] toReturn = {x, y};
        controller.mousePress(toReturn, MousePressOptions.Click);
    }



    /**
     * When the mouse is released, we need to
     * determine whether the mouse is in the
     * boundaries of a circle. If yes, then add
     * a connection between the clicked and 
     * released circle
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    
    ///// Not needed /////

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
