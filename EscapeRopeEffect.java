public class EscapeRopeEffect extends ItemEffect
{
    public EscapeRopeEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Pokemon active = g.getNonCurrentPlayer().getActive();
        Pokemon benched = g.get