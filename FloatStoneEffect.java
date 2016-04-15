
public class FloatStoneEffect extends ToolEffect
{
    private int previousRetreatCost;
    
    public FloatStoneEffect()
    {
        super();
    }
    
    public void activate(Object o)
    {
       
        Pokemon p = (Pokemon) o;
        
        previousRetreatCost = p.getRetreatCost();
        
        
        p.setRetreatCost(0);
    }
    
    public void remove(Object o)
    {
        Pokemon p = (Pokemon) o;
        
        p.setRetreatCost(previousRetreatCost);
    }
    
}