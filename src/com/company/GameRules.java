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
        public static void BlackJackHitMe(Stack<Card> deck, Stack<Card> hand){
            hand.add(deck.pop());
        }

        public static int BlackJackCheckValues(Stack<Card> hand){
            int totalCards= 0;
        for (Card c: hand){
            totalCards += c.getCardValue();
          }

        if (totalCards > 21){
                return -1;
            } else {
                return totalCards;
            }
        }

        public static void BlackJackEndTurn(){

        }
}
