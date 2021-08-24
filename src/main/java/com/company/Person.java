package com.company;

import java.util.Stack;

public class Person {

    Stack<Card> hand = new Stack<>();

private int startingMoney = 500;

    public int getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(int startingMoney) {
        this.startingMoney = startingMoney;
    }

    public Stack<Card> getHand() {
        return hand;
    }

    public void setHand(Stack<Card> hand) {
        this.hand = hand;
    }

    public void showHand (){
//        System.out.println("Your current hand is:");
        for (Card c:getHand()) {
            new CardImageGenerator(c.getSuit(),c.getCardValue());
        }

    }
}
