import java.awt.*;

public abstract class CellType {
    Color colour;
    int random;
    int viscosity;
    Cell loc;
    String cellType;

    public void paint(Graphics g, int x, int y){
        g.setColor(colour);
        g.fillRect(x,y,35,35);
    }

    public void paintString(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString(cellType, 800, 35);
        g.drawString(Integer.toString(viscosity), 830, 55);
    }
}