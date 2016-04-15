import java.util.*;


public class ProfessorSycamoreEffect extends SupporterEffect
{
    public ProfessorSycamoreEffect()
    {
        super();
    }
    
    public void activate(Object o)
    {
        Player p = (Player) o;
        
        p.getDiscard().addAll(p.getHand()); //adds hand to discard
        p.setHand(new ArrayList<Card>()); //resets hand
        p.drawNCards(7); //draws 7 cards
    }
    
}
        