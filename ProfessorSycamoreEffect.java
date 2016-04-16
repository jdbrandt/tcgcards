
public class ProfessorSycamoreEffect extends SupporterEffect
{
    public ProfessorSycamoreEffect()
    {
        super();
    }
    
    public void activate(Player p)
    {
        p.getDiscard().addAll(p.getHand()); //adds hand to discard
        p.setHand(new ArrayList<Card>()); //resets hand
        p.drawToN(7); //draws 7 cards
    }
    
}
        