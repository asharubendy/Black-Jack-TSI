package com.company;

public class CardImageGenerator {

    CardImageGenerator(String type, int cardValue) {
        generateCardVisual(type, cardValue);
    }


    private static void generateCardVisual(String type, int cardValue) {
        String leftCorner ="";
        String rightCorner = "";
        String cardType = "";

        if (cardValue < 9){
            leftCorner ="|    ";
            rightCorner ="    |";
        } else {
            rightCorner ="   |";
            leftCorner ="|   ";
        }

        switch (type) {
            case "Clubs" -> cardType = "\n|  ♣  |\n";
            case "Diamonds" -> cardType = "\n|  ♦  |\n";
            case "Hearts" -> cardType = "\n|  ♥  |\n";
            case "Spades" -> cardType = "\n|  ♠  |\n";
            default -> cardType = "\n|  ?  |\n";
        }
        System.out.println("\n _____\n" + "|" + cardValue + rightCorner + cardType + leftCorner + cardValue + "|\n" + " ¯¯¯¯¯");

    }
}



