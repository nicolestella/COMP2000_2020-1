import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public class Canvas extends JPanel {
        Grid grid = new Grid(20,20);

        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }

        @Override
        public void paint(Graphics g){
            grid.paint(g);
            grid.mouseOver((double)getMousePosition().getX(), (double)getMousePosition().getY());
        }
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run(){
        while(true){
            this.repaint();
        }
    }
}