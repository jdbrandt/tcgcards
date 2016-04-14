

public class ProfessorSycamore extends Supporter
{
    public ProfessorSycamore()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new ProfessorSycamoreEffect();
    }
}