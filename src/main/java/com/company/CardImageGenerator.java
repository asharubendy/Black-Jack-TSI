package com.company;

public class CardImageGenerator {

    CardImageGenerator(String type, int cardValue) {
        generateCardVisual(type, cardValue);
    }


     public static String generateCardVisual(String type, int cardValue) {
        String leftCorner ="";
        String rightCorner = "";
        String cardType = "";

        if (cardValue < 9){
            leftCorner ="|&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
            rightCorner ="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp|";
        } else {
            rightCorner ="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp|";
            leftCorner ="|&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp ";
        }

        switch (type) {
            case "Clubs" -> cardType = "\n|&nbsp&nbsp&nbsp♣&nbsp&nbsp&nbsp|\n";
            case "Diamonds" -> cardType = "\n|&nbsp&nbsp&nbsp♦&nbsp&nbsp&nbsp|\n";
            case "Hearts" -> cardType = "\n|&nbsp&nbsp&nbsp♥&nbsp&nbsp&nbsp|\ns";
            case "Spades" -> cardType = "\n|&nbsp&nbsp&nbsp♠&nbsp&nbsp&nbsp|\n";
            default -> cardType = "\n|&nbsp&nbsp&nbsp?&nbsp&nbsp&nbsp|\n";
        }
        return ("{" + "<p> _____<br>" + "|" + cardValue  + rightCorner  + "<br>" + cardType +"<br>" + leftCorner + cardValue +  "|" + "<br>" + " ¯¯¯¯¯ </p>" + "}");

    }
}



