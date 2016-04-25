
public class Judge extends Supporter
{
    public Judge()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new JudgeEffect();
    }
}