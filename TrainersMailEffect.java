import java.util.*;

public class TrainersMailEffect extends ItemEffect
{
    public TrainersMailEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player current = g.getCurrentPlayer();
        
        ArrayList<Card> top4 = (ArrayList) current.getDeck().subList(0, 4);
        current.viewCardsFromDeck(top4);
        
        boolean isTrainer = false;
        
        for (Card c : top4)
        {
            if (c instanceof Trainer && ! (c instanceof TrainersMail))
            {
                isTrainer = true;
            }
        }
        
        if (isTrainer)
        {
            Card card = current.chooseTrainersMail(g, top4);
            current.deck.remove(card);
            current.hand.add(card);
        }
            
    }
    
}