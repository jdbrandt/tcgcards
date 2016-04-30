
public class FloatStoneEffect extends ToolEffect
{
    private int previousRetreatCost;
    
    public FloatStoneEffect()
    {
        super();
    }
    
    public void activate(Game g, Pokemon p)
    {
        previousRetreatCost = p.getRetreatCost();
        
        
        p.setRetreatCost(0);
    }
    
    public void deactivate(Game g, Pokemon p)
    {
        
        p.setRetreatCost(previousRetreatCost);
    }
    
    public void activate(Game g)
    {
        throw new UnsupportedOperationException();
    }
    

}