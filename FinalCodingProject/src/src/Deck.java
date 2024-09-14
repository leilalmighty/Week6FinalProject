package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

  
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

       
        for (int i = 0; i < values.length; i++) {
            for (String suit : suits) {
               
                cards.add(new Card(i + 2, values[i] + " of " + suit));
            }
        }
        shuffle();
    }

    
    public void shuffle() {
        Collections.shuffle(cards);
    }

    
    public Card draw() {
        if (cards.isEmpty()) {
            System.out.println("The deck is empty.");
            return null; 
        }
        return cards.remove(cards.size() - 1);
    }
}