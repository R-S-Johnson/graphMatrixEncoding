

public interface State {


    void start(Controller controller, MatrixEncodingApplication panel);

    void mousePress(int[] position, MousePressOptions m);

}
