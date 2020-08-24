import java.awt.*;

public class Wall extends CellType {

    public Wall(Cell loc) {
        this.loc = loc;
        this.random = 0;
        this.colour = Color.GRAY;
        this.viscosity = 1000;
        this.cellType = "Wall";
    }

}