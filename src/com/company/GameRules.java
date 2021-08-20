package com.company;
import java.util.Stack;

public class GameRules {
    public static void BlackJackGameRules(Stack<Card> deck){
        for (Card c:deck)
        {
            //sets face cards to have a value of 10
            if(c.isFaceCard()){
                c.setCardValue(10);
            }
        }
    }
        public static void BlackJackDealNewHand(Stack<Card> deck, Stack<Card> hand, Stack<Card> dealerhand){

            hand.add(deck.pop());
            dealerhand.add(deck.pop());
            hand.add(deck.pop());
            dealerhand.add(deck.pop());

        }
        public static void BlackJackHitMe(Stack<Card> deck, Stack<Card> Hand){

        }
}
