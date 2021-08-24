package com.company;


public class Dealer extends Person{
    @Override
    public void showHand (){
//        System.out.println("The dealers hand is:");
        for (Card c:getHand()) {
           new CardImageGenerator(c.getSuit(),c.getCardValue());
        }
    }
}
