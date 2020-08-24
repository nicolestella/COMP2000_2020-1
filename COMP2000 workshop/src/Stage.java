import java.awt.*;

class Stage {
    Grid grid;

    Actor[] actors = new Actor[3];

    public Stage(Grid grid){
        this.grid = grid;
        Rabbit rabbit = new Rabbit(grid.cells[0][1]);
        Lion lion = new Lion(grid.cells[1][0]);
        Puppy puppy = new Puppy(grid.cells[2][0]);

        actors[0] = rabbit;
        actors[1] = lion;
        actors [2] = puppy;
    }

    public void paint(Graphics g){
        for(int i=0;i<actors.length;i++){
            actors[i].paint(g);
        }
    }
}