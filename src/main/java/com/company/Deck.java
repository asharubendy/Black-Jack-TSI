package com.company;

public class Deck {
    private static int amount = 52;
    static final int amountInEachSuit = 13;
    private static String[] suitType = {"Hearts","Clubs","Spades","Diamonds"};

    public static String[] getSuitType() {
        return suitType;
    }

    public static void setSuitType(String[] suitType) {
        Deck.suitType = suitType;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Deck.amount = amount;
    }

    public static int getAmountInEachSuit() {
        return amountInEachSuit;
    }
}
