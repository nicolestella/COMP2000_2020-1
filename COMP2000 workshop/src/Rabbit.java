import java.awt.*;

class Rabbit implements Actor{
    Cell location;

    public Rabbit(Cell loc){
        location = loc;
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(location.x,location.y,35,35);
    }
}