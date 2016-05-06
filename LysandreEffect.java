
public class LysandreEffect extends SupporterEffect
{
    public LysandreEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Pokemon newActivePokemon = g.getCurrentPlayer().chooseToGust(g);
        Pokemon oldActivePokemon = g.getNonCurrentPlayer().getActive();
        
        g.getNonCurrentPlayer().setActive(newActivePokemon);
        g.getNonCurrentPlayer().getBench().add(oldActivePokemon);
    }
}