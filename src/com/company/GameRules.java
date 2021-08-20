package com.company;
import java.util.Stack;

public class GameRules {
    public static Stack<Card> BlackJackGameRules(Stack<Card> deck){
        for (Card c:deck)
        {
            //sets face cards to have a value of 10
            if(c.isFaceCard()){
                c.setCardValue(10);
            }
        }
        return deck;
    }
}
