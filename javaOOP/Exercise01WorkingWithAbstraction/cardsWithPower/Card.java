package Exercise01WorkingWithAbstraction.cardsWithPower;

import Exercise01WorkingWithAbstraction.cardRank.CardRank;
import Exercise01WorkingWithAbstraction.cardSuit.CardSuits;

public class Card {
    private CardSuits cardSuits;
    private CardRank cardRank;

    public Card(CardSuits cardSuits, CardRank cardRank) {
        this.cardSuits = cardSuits;
        this.cardRank = cardRank;
    }
    public int getPower(){
        return cardRank.getRankPower()  +  cardSuits.getSuitPower();
    }
}
