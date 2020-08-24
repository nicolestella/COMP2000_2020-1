import java.awt.*;

class Puppy implements Actor{
    Cell location;

    public Puppy(Cell loc){
        location = loc;
    }

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(location.x,location.y,35,35);
    }
}