import java.util.*;


public class ProfessorSycamoreEffect extends SupporterEffect
{
    public ProfessorSycamoreEffect()
    {
        super();
    }
    
    public void activate(Object o)
    {
<<<<<<< HEAD
        Player p = (Player) o;
        
=======
>>>>>>> 1db5d2a7a8a3aca845e5de117f35b36e9edcb27a
        p.getDiscard().addAll(p.getHand()); //adds hand to discard
        p.setHand(new ArrayList<Card>()); //resets hand
        p.drawNCards(7); //draws 7 cards
    }
    
}
        