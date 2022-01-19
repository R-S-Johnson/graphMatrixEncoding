import java.awt.Component;

public class Controller {

    State[] states;

    State currentState;

    GamePanel panel;


    public Controller() {
        states = new State[3];
        states[0] = new StateMain();
        currentState = states[0];
        panel = new GamePanel();
    }

    public GamePanel getPanel() {
        return panel;
    }

    public void start() {
        currentState.start(this, panel);
    }

}
