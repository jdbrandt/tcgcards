import java.util.*;
public class PuzzleOfTimeEffect extends ItemEffect
{
    public PuzzleOfTimeEffect()
    {
        super();
    }

    public void activate(Game g)
    {

        boolean shouldPlayTwo;
        Player current = g.getCurrentPlayer();
        if (!g.getCurrentPlayer().getHand().contains(new PuzzleOfTime()))
        {
            shouldPlayTwo = false;
        }

        else
        {
            shouldPlayTwo = current.shouldPlayTwoPuzzle(g);
        }

        if (shouldPlayTwo)
        {
            Card[] cards = current.choosePuzzle(g, 2);
            for (int i = 0; i < 2; i++)
            {
                current.getHand().add(current.getDiscard().remove(i));
            }
        }
        else
        {
            Card[] cards = current.sortPokedex(g, (ArrayList)current.getDeck().subList(0, 3));
            current.getDeck().removeAll(current.getDeck().subList(0, 3));
            for (int i = 0; i < 3; i++)
            {
                current.getDeck().add(i, cards[i]);
            }
        }
    }
}
