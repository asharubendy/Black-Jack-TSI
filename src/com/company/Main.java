package com.company;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Stack<Card> deck;
    static Player player = new Player();
    static Dealer dealer = new Dealer();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        GameSetupBlackJack();
        GameLogicBlackJack();
    }

    public static void GameSetupBlackJack(){
        deck = DeckGenerator.GenerateDeck();
        GameRules.BlackJackGameRules(deck);
        GameRules.BlackJackDealNewHand(deck, player.getHand(), dealer.getHand());
    }

    public static void GameLogicBlackJack(){
        boolean playerTurn = true;
        while(playerTurn) {
            ShowHands();
            if(GameRules.BlackJackCheckValues(player.getHand()) == -1){
                System.out.println("Lose state");
                break;
            } else if(GameRules.BlackJackCheckValues(player.getHand()) != 21) {
                System.out.print("Your total is: " + GameRules.BlackJackCheckValues((player.getHand())));
                System.out.println("What would you like to do? \n 1. Hit Me \n 2. Hold");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1 -> GameRules.BlackJackHitMe(deck, player.getHand());
                    case 2 -> {GameRules.BlackJackEndTurn(); playerTurn = false;}
                }
            } else {
                System.out.println("Win State");
            }
        }
    }
    public  static void ShowHands(){
        dealer.showHand();
        player.showHand();
    }
}
