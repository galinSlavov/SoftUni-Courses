package Exercise01WorkingWithAbstraction.cardsWithPower;

import Exercise01WorkingWithAbstraction.cardRank.CardRank;
import Exercise01WorkingWithAbstraction.cardSuit.CardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardSuits, cardRank);
        System.out.printf("Card name: %s of %s; Card power: %d.",cardRank, cardSuits, card.getPower());
    }
}
