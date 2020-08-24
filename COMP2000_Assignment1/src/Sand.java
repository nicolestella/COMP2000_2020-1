import java.awt.*;

public class Sand extends CellType {

    public Sand(Cell loc) {
        this.loc = loc;
        this.random = (int)(Math.random() * 72) + 183;
        this.colour = new Color(255, random, 0);
        this.cellType = "Sand";

        if(this.random >= 240 && this.random <= 255){
            this.viscosity = 15;
        }
        else {
            this.viscosity = 5;
        }
    }

}