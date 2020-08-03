import java.awt.*;

public class Grid {
    int cellSize = 35;
    Cell[][] cells;

    int width;
    int height;

    public Grid (int x, int y){
        cells = new Cell[x][y];

        width = x;
        height = y;

        //populate cells array with Cell objects
        for(int i=0;i<x;i++){
            for(int j=0;j<cells[i].length;j++){
                cells[i][j] = new Cell(cellSize,cellSize);
            }
        }
    }

    public void paint (Graphics g){
        int xLoc = 10;
        int yLoc = 10;

        for (int row=0; row < cells.length; row++){
            for(int col = 0; col < cells[row].length; col++){

                //for each column, draw a cell, then increase yLoc by cellSize             
                cells[row][col].paint(g, xLoc, yLoc);
                yLoc += cellSize;               
            }

            //when end of the column is reached, reset yLoc and move over to a new column
            yLoc = 10;
            xLoc += cellSize;
        }
    }

    public void mouseOver(double x, double y){
        Color highlightCol = Color.GRAY;

        for(int row = 0; row<cells.length; row++){
            for(int col = 0; col<cells[row].length; col++){
                
                //if mouse position is more than the left edges of the cell and less than
                //the right edges of the cell, make the color grey
                if(((x >= (10+(cellSize * row))) && (x <= (10+(cellSize * (row+1))))) &&
                ((y >= (10+(cellSize * col))) && (y <= (10+(cellSize * (col+1)))))){
                    cells[row][col].cellColor(highlightCol);
                }

                //if mouse position is not on the highlighted cell, make it white again
                else {
                    cells[row][col].cellColor(Color.WHITE);
                }
            }
        }
    }
}