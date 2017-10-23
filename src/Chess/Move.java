/**
 * @(#) Move.java
 */

package Chess;

public class Move implements MoveInterface
{
    private Cell from;
    
    private Cell to;
    
    private Figure figure;

    public Move(Cell from, Cell to, Figure figure) {
        this.from = from;
        this.to = to;
        this.figure = figure;
    }
    
    public void execute( )
    {
        System.out.println("Executed simple move");
    }
    
    public void undo( )
    {
        
    }
    
    
}
