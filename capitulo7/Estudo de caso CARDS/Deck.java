import java.security.SecureRandom;

public class Deck {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom secureRandom = new SecureRandom();

    public Deck() {
        String[] faces = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Copas", "Ouros", "Espadas", "Paus"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }

    public void shuffleDeck() {
        currentCard = 0;

        for (int i = 0; i < deck.length; i++) {
            int cardAleatory = secureRandom.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[i];
            deck[i] = deck[cardAleatory]; 
            deck[cardAleatory] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}
