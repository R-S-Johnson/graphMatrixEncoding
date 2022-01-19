import java.awt.Component;

public class Controller {

    private State[] states;

    private State currentState;

    private MatrixEncodingApplication panel;


    public Controller(MatrixEncodingApplication panel) {
        this.panel = panel;
        states = new State[3];
        states[0] = new StateMain();
        currentState = states[0];
    }


    public void start() {
        currentState.start(this, panel);
    }

    public void mousePress(int[] p, MousePressOptions m) {
        currentState.mousePress(p, m);
    }

}
