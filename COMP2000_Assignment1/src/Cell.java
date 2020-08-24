import java.awt.*;
import java.lang.Math;

class Cell extends Rectangle {
    // fields
    static int size = 35;
    int rand = (int)(Math.random() * 101);

    CellType sand;
    CellType wall;
    CellType oasis;
    CellType palmTree;

    CellType currCell;
    
    //constructors
    public Cell(int x, int y){
        super(x,y,size,size);

        sand = new Sand(this);
        wall = new Wall(this);
        oasis = new Oasis(this);
        palmTree = new PalmTree(this);

        //different cell types painted here.
        //random number generated will determine the cell type drawn.
        if(rand >= 0 && rand <= 69) {
            currCell = sand;
        }
        else if(rand >= 70 && rand <= 79){
            currCell = wall;
        }
        else if(rand >= 80 && rand <= 89) {
            currCell = oasis;
        }
        else {
            currCell = palmTree;
        }
    }

    //methods
    void paint(Graphics g, Point mousePos){
        g.setColor(Color.BLACK);
        g.drawString("Cell Type: ", 730, 35);
        g.drawString("Crossing Time: ", 730, 55);

        if(contains(mousePos)){
            g.setColor(Color.GRAY);
            g.fillRect(x,y,size,size);

            currCell.paintString(g);   
        } else {
            currCell.paint(g,x,y);
        }
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