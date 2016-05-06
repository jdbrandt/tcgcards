
public class AZEffect extends SupporterEffect
{
    
    public AZEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Pokemon pokemonToRemove = g.getCurrentPlayer().chooseAZ(g);
        g.getCurrentPlayer().AZ(g,pokemonToRemove);
    }
}