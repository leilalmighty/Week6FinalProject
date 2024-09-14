package src;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player james = new Player("James");
        Player charles = new Player("Charles");

        
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                charles.draw(deck); 
            } else {
                james.draw(deck); 
            }
        }

        
        for (int i = 0; i < 26; i++) {
            Card cardJames = james.flip();
            Card cardCharles = charles.flip();

            System.out.println("James plays: " + cardJames.getName());
            System.out.println("Charles plays: " + cardCharles.getName());

            if (cardJames.getValue() > cardCharles.getValue()) {
                james.incrementScore();
                System.out.println("James wins this round!");
            } else if (cardCharles.getValue() > cardJames.getValue()) {
                charles.incrementScore();
                System.out.println("Charles wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
        }

       
        System.out.println("Final Scores:");
        james.describe();
        charles.describe();
        if (james.getScore() > charles.getScore()) {
            System.out.println("James wins the game!");
        } else if (charles.getScore() > james.getScore()) {
            System.out.println("Charles wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}