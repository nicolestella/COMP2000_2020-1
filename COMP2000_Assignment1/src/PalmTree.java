import java.awt.*;

public class PalmTree extends CellType {

    public PalmTree(Cell loc) {
        this.loc = loc;
        this.random = (int)(Math.random() * 150);
        this.colour = new Color(random, 255, 0);
        this.viscosity = 2;
        this.cellType = "Palm Tree";
    }

}