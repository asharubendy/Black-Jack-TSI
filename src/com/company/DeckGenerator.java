package com.company;

import java.util.Collections;
import java.util.Stack;

public class DeckGenerator {
    public static Stack<Card> GenerateDeck() {
        Stack<Card> deck = new Stack<>();
        int suitSize = Deck.getAmountInEachSuite();
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
       return (ShuffleDeck(deck));
    }
    public static Stack<Card> ShuffleDeck(Stack<Card> deck){
        Collections.shuffle(deck);
        return deck;
    }

}
