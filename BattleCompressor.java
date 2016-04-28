

public class BattleCompressor extends Item
{
    public BattleCompressor()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new BattleCompressorEffect();
    }
}
