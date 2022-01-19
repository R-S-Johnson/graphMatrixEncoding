import java.util.Random;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StateMain implements State {

    Controller controller;

    GamePanel gamePanel;

    int[] nodes;

    Boolean clicked;

    int[] mousePosition;

    int[][] connectionMatrix;


    @Override
    public void start(Controller controller, GamePanel gamePanel) {
        this.controller = controller;
        this.gamePanel = gamePanel;

        this.nodes = new int[5];

        connectionMatrix = new int[5][5];

        // randomly generate lettering
        generateNumbering();

        // draw(-1);
    }


    // public void draw(int selected) {
    //     // draw circles
    //     gamePanel.drawCircles();

    //     // draw line from mouse if dragging
    //     if (clicked && selected != -1) {
    //         gamePanel.drawMouseLine(nodes[selected], mousePosition);
    //     }

    //     // draw already connected lines
    //     for (int i = 0; i < Array.getLength(connectionMatrix); i++) {
    //         for (int j = 0; j < i; j++) {
    //             if (connectionMatrix[i][j] == 1) {
    //                 gamePanel.drawConnectionLine(i, j);
    //             }
    //         }
    //     }
    // }


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
}
