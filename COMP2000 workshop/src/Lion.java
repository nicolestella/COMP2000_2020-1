import java.awt.*;

class Lion implements Actor{
    Cell location;

    public Lion(Cell loc){
        location = loc;
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(location.x,location.y,35,35);
    }
}