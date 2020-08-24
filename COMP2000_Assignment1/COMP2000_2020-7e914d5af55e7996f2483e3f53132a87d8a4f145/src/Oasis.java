import java.awt.*;

public class Oasis extends CellType {

    public Oasis(Cell loc) {
        this.loc = loc;
        this.random = (int)(Math.random() * 255);
        this.colour = new Color(0, random, 255);
        this.viscosity = 8;
        this.cellType = "Oasis";
    }

}