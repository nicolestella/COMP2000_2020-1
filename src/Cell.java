import java.awt.*;

public class Cell {
    int width;
    int height;

    Color color = Color.WHITE;

    public Cell (int x, int y) {
        width = x;
        height = y;
    }

    public void paint (Graphics g, int x, int y){
        g.setColor(color);
        g.fillRect(x,y,width,height);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,width,height);
    }

    public void cellColor(Color color){
        this.color = color;
    }
}