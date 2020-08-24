import java.awt.*;
import java.lang.Math;

class Cell extends Rectangle {
    // fields
    static int size = 35;

    //random sand values
    int sandBlue = (int)(Math.random() * 72) + 183;
    Color sandColor = new Color(255, sandBlue, 0);
    int viscosity = sandBlue/10;
    
    //constructors
    public Cell(int x, int y){
        super(x,y,size,size);
    }

    //methods
    void paint(Graphics g, Point mousePos){
        g.setColor(Color.BLACK);
        g.drawString("Sand Viscosity: ", 730, 35);

        if(contains(mousePos)){
            g.setColor(Color.BLACK);
            g.drawString("Sand Viscosity: "+viscosity, 730, 35);
            g.setColor(Color.GRAY);
        } else {
            g.setColor(sandColor);   
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    public boolean contains(Point p){
        if (p != null){
            return super.contains(p);
        } else {
            return false;
        }
    }
}