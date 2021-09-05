package com.company;


import java.util.Stack;

public class Dealer extends Person {
    @Override
    public void showHand (){
//        System.out.println("The dealers hand is:");
        for (Card c:getHand()) {
           new CardImageGenerator(c.getSuit(),c.getCardValue());
        }
    }
    public void dealerLogicCompute(int inputValue, Stack<Card> deck, Stack<Card> PlayerDeck){

    }
}
