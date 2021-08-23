package com.company;

public class CardImageGenerator {

    CardImageGenerator(String type, int cardValue) {
        generateCardVisual(type, cardValue);
    }


    private static void generateCardVisual(String type, int cardValue) {
        String leftCorner ="";
        String rightCorner = "";


        if (cardValue < 9){
            leftCorner ="|    ";
            rightCorner ="    |";
        } else {
            rightCorner ="   |";
            leftCorner ="|   ";
        }


        switch (type) {
            case "Clubs" -> {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + rightCorner);
                System.out.println("|  ♣  |");
                System.out.println(leftCorner + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            }
            case "Diamonds" -> {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + rightCorner);
                System.out.println("|  ♦  |");
                System.out.println(leftCorner + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            }
            case "Hearts" -> {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + rightCorner);
                System.out.println("|  ♥  |");
                System.out.println(leftCorner + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            }
            case "Spades" -> {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + rightCorner);
                System.out.println("|  ♠  |");
                System.out.println(leftCorner + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            }
            default -> {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + rightCorner);
                System.out.println("|  ?  |");
                System.out.println(leftCorner + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            }
        }

    }
}



