package src;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public Card flip() {
        if (hand.isEmpty()) {
            return null; 
        }
        return hand.remove(hand.size() - 1);
    }

    public void incrementScore() {
        score++;
    }

    public void describe() {
        System.out.println(name + " (Score: " + score + ")");
        for (Card card : hand) {
            card.describe();
        }
    }
}