package com.company;

import java.util.Stack;

public class Dealer extends Person{
    public void showHand (){
        System.out.println("The dealers hand is:");
        for (Card c:getHand()) {
            CardImageGenerator.GenerateCardVisual(c.getSuit(),c.getCardValue());
        }
    }
//    public void dealerPlay(Stack<Card> hand, Stack<Card> deck{
//
//    }
}
