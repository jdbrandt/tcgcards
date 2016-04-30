public class TrainersMail extends Item
{
    public TrainersMail()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new TrainersMailEffect();
    }
}