class Card {
    public static final String SPADES = "spades";
    public static final String HEARTS = "hearts";
    public static final String DIAMONDS = "diamonds";
    public static final String CLUBS = "clubs";
    public static final int SIZE_OF_ONE_SUIT = 13;
    private String suit;
    private int count;

    public Card(String s, int c) {
        suit = s;
        count = c;
    }

    public String toString() {
        return (suit + ": " + count);
    }

    public String getSuit() {
        return suit;
    }

    public int getCount() {
        return count;
    }
}

class CardDeck {
    private int card_count;  // how many cards remain in the deck
    private Card card_before = null;  // card returned when newCard() was called last time
    private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];

    public CardDeck() {
        createSuit(Card.SPADES); // 0~13
        createSuit(Card.HEARTS); // 14~27
        createSuit(Card.CLUBS); // 28~40
        createSuit(Card.DIAMONDS); // 41~53
    }

    public Card newCard() {
        // fill here!
        // Math.random(): 0이상 1미만의 실수를 랜덤하게 선택하여 반환한다.
        if (card_before == null) {
            int randomSuit = (int) (Math.random() * 4); // 0 ~ 3
            int randomNumber = (int) (Math.random() * 13); // 0 ~ 12
            int cardIndex = randomSuit * Card.SIZE_OF_ONE_SUIT + randomNumber; // 0 ~ 51
            card_before = deck[cardIndex];
            deck[cardIndex] = null;
            return card_before;
        } else {
            Card nextCard = null;
            int suit = 0;
            int number = card_before.getCount();
            switch (card_before.getSuit()){
                case Card.SPADES -> suit = 0;
                case Card.HEARTS -> suit = 1;
                case Card.DIAMONDS -> suit = 2;
                case Card.CLUBS -> suit = 3;
            }
            switch ((int)(Math.random()*4)){
                case 0 -> nextCard = deck[suit * Card.SIZE_OF_ONE_SUIT + number + 1];
            }
            return card_before;
        }
    }

    private void createSuit(String which_suit) {
        for (int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i = i + 1) {
            deck[card_count] = new Card(which_suit, i);
            card_count = card_count + 1;
        }
    }
}

public class C1_Q4 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        System.out.println(cd.newCard().toString()); // hearts: 13
        System.out.println(cd.newCard().toString()); // spades: 13
        System.out.println(cd.newCard().toString()); // spades: 12
    }
}
