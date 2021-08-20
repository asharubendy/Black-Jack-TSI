package com.company;

public class Card extends Deck {
    private int cardValue;
    private String Suit;
    private boolean IsFaceCard;
    private String FaceCardType;

    public Card(int cardValue, String suit) {
        this.cardValue = cardValue;
        Suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String getSuit() {
        return Suit;
    }

    public void setSuit(String suit) {
        Suit = suit;
    }

    public boolean isFaceCard() {
        return IsFaceCard;
    }

    public void setFaceCard(boolean faceCard) {
        IsFaceCard = faceCard;
    }

    public String getFaceCardType() {
        return FaceCardType;
    }

    public void setFaceCardType(String faceCardType) {
        FaceCardType = faceCardType;
    }
}
