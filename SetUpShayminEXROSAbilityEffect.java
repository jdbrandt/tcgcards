
public class SetUpShayminEXROSAbilityEffect extends AbilityEffect
{
    public SetUpShayminEXROSAbilityEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        g.getCurrentPlayer().drawNCards(6-g.getCurrentPlayer().getHand().size());
    }
}