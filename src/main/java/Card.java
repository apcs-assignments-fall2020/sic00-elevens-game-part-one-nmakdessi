
public class Card {

    private String suit;
    
    private String rank;
    
	private int pointValue;


	public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.cardPointValue = cardPointValue;
	}


	public String getSuit() {
        return this.suit;
    }

	public String getRank() {
        return this.rank;
	}

	public int getPointValue() {
        return this.pointValue;
	}


	public boolean equals(Card otherCard) {
        if (this.rank == otherCard.getRank() && this.suit == otherCard.getSuit() && this.pointValue == otherCard.getPointValue()){
        }
        return true;
	}


	public String toString() {
        // YOUR CODE HERE
        return (rank + " of " + suit + " point value = " + pointValue);
	}
}
