package com.company;
import java.util.Collections;
import java.util.Stack;

public final class DeckGenerator {

    public static Stack<Card>getDeck() {
        return generateDeck();
    }

    private static Stack<Card> generateDeck() {
        Stack<Card> deck = new Stack<>();
        int suitSize = Deck.getAmountInEachSuit();
        String[] suits = Deck.getSuitType();
        for (int suitCount = 0; suitCount <= 3; suitCount++) {
            for (int i = 1; i <= suitSize; i++) {
              Card card = new Card(i,suits[suitCount]);
              switch (card.getCardValue()) {
                  case 11 -> {card.setFaceCardType("Joker"); card.setFaceCard(true);}
                  case 12 -> {card.setFaceCardType("Queen"); card.setFaceCard(true);}
                  case 13 -> {card.setFaceCardType("King"); card.setFaceCard(true);}
                  default -> {card.setFaceCardType("Regular");  card.setFaceCard(false);}
              }
              deck.push(card);
            }
        }
       return (shuffleDeck(deck));
    }
    public static Stack<Card> shuffleDeck(Stack<Card> deck){
        Collections.shuffle(deck);
        return deck;
    }

}
