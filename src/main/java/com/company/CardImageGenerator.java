package com.company;

public class CardImageGenerator {


    public static void generateCardVisual(String type, int cardValue) {
        if(cardValue < 9) {
            if (type.equals("Clubs")) {
                System.out.println("\n _____");
                System.out.println( "|" + cardValue + "    |");
                System.out.println("|  ♣  |");
                System.out.println("|    " + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            } else if (type.equals("Diamonds")) {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + "    |");
                System.out.println("|  ♦  |");
                System.out.println("|    " + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            } else if (type.equals("Hearts")) {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + "    |");
                System.out.println("|  ♥  |");
                System.out.println("|    " + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            } else if (type.equals("Spades")) {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + "    |");
                System.out.println("|  ♠  |");
                System.out.println("|    " + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            } else {
                System.out.println("\n _____");
                System.out.println("|" + cardValue + "    |");
                System.out.println("|  ?  |");
                System.out.println("|    " + cardValue + "|");
                System.out.println(" ¯¯¯¯¯");
            }
        } else {
                if (type.equals("Clubs")) {
                    System.out.println("\n _____");
                    System.out.println("|" + cardValue + "   |");
                    System.out.println("|  ♣  |");
                    System.out.println("|   " + cardValue + "|");
                    System.out.println(" ¯¯¯¯¯");
                } else if (type.equals("Diamonds")) {
                    System.out.println("\n _____");
                    System.out.println("|" + cardValue + "   |");
                    System.out.println("|  ♦  |");
                    System.out.println("|   " + cardValue + "|");
                    System.out.println(" ¯¯¯¯¯");
                } else if (type.equals("Hearts")) {
                    System.out.println("\n _____");
                    System.out.println("|" + cardValue + "   |");
                    System.out.println("|  ♥  |");
                    System.out.println("|   " + cardValue + "|");
                    System.out.println(" ¯¯¯¯¯");
                } else if (type.equals("Spades")) {
                    System.out.println("\n _____");
                    System.out.println("|" + cardValue + "   |");
                    System.out.println("|  ♠  |");
                    System.out.println("|   " + cardValue + "|");
                    System.out.println(" ¯¯¯¯¯");
                } else {
                    System.out.println("\n _____");
                    System.out.println("|" + cardValue + "   |");
                    System.out.println("|  ?  |");
                    System.out.println("|   " + cardValue + "|");
                    System.out.println(" ¯¯¯¯¯");
                }
            }
    }
}



