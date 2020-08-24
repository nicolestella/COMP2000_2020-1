import java.awt.*;

public class Sand extends CellType {

    public Sand(Cell loc) {
        this.loc = loc;
        this.random = (int)(Math.random() * 100) + 183;
        this.colour = new Color(255, random, 0);
        this.cellType = "Sand";

        if(this.random >= 262 && this.random <= 283){
            this.viscosity = 15;
        }
        else {
            this.viscosity = 5;
        }
    }

}