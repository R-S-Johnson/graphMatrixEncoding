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


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO remove (testing)
        System.out.println("mouseClicked called");        
    }

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
