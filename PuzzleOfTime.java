

public class PuzzleOfTime extends Item
{
    public PuzzleOfTime()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new PuzzleOfTimeEffect();
    }
}