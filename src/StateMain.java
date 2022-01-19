import java.util.Random;

public class StateMain implements State {

    Controller controller;

    int[] nodes;

    Boolean clicked;

    int[] mousePosition;

    int[][] connectionMatrix;

    private MatrixEncodingApplication panel;


    @Override
    public void start(Controller controller, MatrixEncodingApplication panel) {
        this.panel = panel;
        this.controller = controller;

        this.nodes = new int[5];

        connectionMatrix = new int[5][5];

        // randomly generate lettering
        generateNumbering();

    }

    private void generateNumbering() {
        // Insert numbers in order
        for (int i = 0; i < 5; i++) {
            nodes[i] = i;
        }

        // set all connections to 0
        for (int i = 0; i < connectionMatrix.length; i++) {
            for (int j = 0; j < i; j++) {
                connectionMatrix[i][j] = 0;
            }
        }

        // scramble
        Random rand = new Random();
		for (int i = 0; i < nodes.length; i++) {
			int randomIndexToSwap = rand.nextInt(nodes.length);
			int temp = nodes[randomIndexToSwap];
			nodes[randomIndexToSwap] = nodes[i];
			nodes[i] = temp;
		}
    }

    @Override
    public void mousePress(int[] position, MousePressOptions m) {
        int x = position[0];
        int y = position[1];

        if (m == MousePressOptions.Click) {
            // Check all circles
            if (withinConfines(x, y, 400, 150)) {
                panel.setPressed(true);
                // choice 1
            }
            else if (withinConfines(x, y, 150, 350)) {
                panel.setPressed(true);
                // choice 2
            }
            else if (withinConfines(x, y, 650, 350)) {
                panel.setPressed(true);
                // choice 3
            }
            else if (withinConfines(x, y, 250, 700)) {
                panel.setPressed(true);
                // choice 4
            }
            else if (withinConfines(x, y, 550, 700)) {
                panel.setPressed(true);
                // choice 5
            }
        }
    }


    private boolean withinConfines(int x, int y, int i, int j) {
        if (x <= i+13 && x >= i-13 && y <= j+13 && y >= j-13) {
            return true;
        }
        return false;
    }
}
