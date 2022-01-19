public class StateMain implements State {

    Controller controller;

    GamePanel gamePanel;

    String[] nodes;


    @Override
    public void start(Controller controller, GamePanel gamePanel) {
        this.controller = controller;
        this.gamePanel = gamePanel;

        this.nodes = new String[5];

        // randomly generate lettering
        generateLettering();
    }


    private void generateLettering() {
        for (int i = 0; i < 5; i++) {
            nodes[i] = str(i);
        }
    }


    private String str(int i) {
        return i < 0 ? "" : str((i / 26) - 1) + (char)(65 + i % 26);
    }
    
}
