import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid;
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
            stage = new Stage(grid);
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
            stage.paint(g);
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
}