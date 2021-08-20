package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack<Card> deck = new Stack<>();
        deck = DeckGenerator.GenerateDeck();
        GameRules.BlackJackGameRules(deck);
        for (Card c : deck) {
            System.out.println(c.getSuit());
            System.out.println(c.getFaceCardType());
            System.out.println(c.getCardValue());
        }
        System.out.print("❤");
        System.out.print("♦️");
        System.out.print("♠️");
        System.out.print("♣️");

        CardImageGenerator.GenerateCardVisual("Diamonds", 10);
        CardImageGenerator.GenerateCardVisual("Diamonds", 1);
        CardImageGenerator.GenerateCardVisual("Hearts", 10);
        CardImageGenerator.GenerateCardVisual("Hearts", 5);
        CardImageGenerator.GenerateCardVisual("Clubs", 10);
        CardImageGenerator.GenerateCardVisual("Clubs", 5);
        CardImageGenerator.GenerateCardVisual("Spades", 10);
        CardImageGenerator.GenerateCardVisual("Spades", 7);

    }
}