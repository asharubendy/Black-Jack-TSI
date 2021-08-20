package com.company;

import java.util.Stack;

public class Main {
    static Stack<Card> deck;
    static Player player = new Player();
    static Dealer dealer = new Dealer();

    public static void main(String[] args) {
        // write your code here
        GameSetup();
        player.showHand();

    }
    public static void GameSetup(){
        deck = DeckGenerator.GenerateDeck();
        GameRules.BlackJackGameRules(deck);
        GameRules.BlackJackDealNewHand(deck, player.getHand(), dealer.getHand());
    }
}
