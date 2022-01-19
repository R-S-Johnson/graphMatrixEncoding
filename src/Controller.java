import java.awt.Component;

public class Controller {

    private State[] states;

    private State currentState;


    public Controller() {
        states = new State[3];
        states[0] = new StateMain();
        currentState = states[0];
    }


    public void start() {
        currentState.start(this);
    }

}
