package com.company;
import java.util.Stack;

public final class GameRules {


    private GameRules() {
    }

    public static void blackJackGameRules(Stack<Card> deck){
        for (Card c:deck)
        {
            //sets face cards to have a value of 10
            if(c.isFaceCard()){
                c.setCardValue(10);
            }
        }
    }
        public static void blackJackDealNewHand(Stack<Card> deck, Stack<Card> hand, Stack<Card> dealerhand){

            hand.add(deck.pop());
            dealerhand.add(deck.pop());
            hand.add(deck.pop());
            dealerhand.add(deck.pop());

        }
        public static void blackJackHitMe(Stack<Card> deck, Stack<Card> hand){
            hand.add(deck.pop());
        }

        public static int blackJackCheckValues(Stack<Card> hand){
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

        public static void blackJackAceRules(Stack<Card> hand){
        int totalCardValue = blackJackCheckValues(hand);
        for (Card c: hand){
            if(c.getCardValue() == 1 && totalCardValue >= 10){
                c.setCardValue(11);
            }
            }
        }
}
