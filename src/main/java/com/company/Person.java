package com.company;

import java.util.Stack;

public class Person {

    static Stack<Card> hand = new Stack<>();

private static int startingMoney = 500;

    public static int getStartingMoney() {
        return startingMoney;
    }

    public Stack<Card> getHand() {
        return hand;
    }

    public void setHand(Stack<Card> hand) {
        Person.hand = hand;
    }

    public void showHand(){
//        System.out.println("Your current hand is:");
        for (Card c:getHand()) {
            new CardImageGenerator(c.getSuit(),c.getCardValue());
        }

    }
}
