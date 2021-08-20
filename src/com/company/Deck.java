package com.company;

public class Deck {
    private static int amount = 52;
    private static int amountInEachSuite = 13;
    private static String[] suitType = {"Heart","Club","Spade","Diamond"};

    public static String[] getSuitType() {
        return suitType;
    }

    public static void setSuitType(String[] suitType) {
        Deck.suitType = suitType;
    }

    public static int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static int getAmountInEachSuite() {

        return amountInEachSuite;
    }

    public void setAmountInEachSuite(int amountInEachSuite) {
        this.amountInEachSuite = amountInEachSuite;
    }
}
