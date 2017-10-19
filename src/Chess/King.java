/**
 * @(#) King.java
 */

package Chess;

public class King extends Figure
{
    //konstruktorius. Iskvieciamas clone metode
    public King (King x)
    {
        super(x);
    }

    @Override
    public Figure clone()
    {
        return new King(this);
    }

    @Override
    public void validMoves()
    {
        
    }
}
