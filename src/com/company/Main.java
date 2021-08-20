package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<Card> deck = new Stack<>();
        deck = DeckGenerator.GenerateDeck();
        GameRules.BlackJackGameRules(deck);
        for(Card c: deck){
            System.out.println(c.getSuit());
            System.out.println(c.getFaceCardType());
            System.out.println(c.getCardValue());
        }

    }
}
