
public class AZEffect extends SupporterEffect
{
    
    public AZEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Pokemon pokemonToRemove = g.getCurrentPlayer().choosePokemonToAZ(g);
        g.getCurrentPlayer().movePokemonToHandDiscardAttached(g,pokemonToRemove);
    }
}