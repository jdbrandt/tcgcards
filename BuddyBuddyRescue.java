
public class BuddyBuddyRescue extends Item
{
    public BuddyBuddyRescue()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new BuddyBuddyRescueEffect();
    }
    
}
