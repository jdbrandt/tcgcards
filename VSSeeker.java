
public class VSSeeker extends Item
{
    public VSSeeker()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new VSSeekerEffect();
    }
}