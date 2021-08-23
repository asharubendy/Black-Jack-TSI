package com.company;

public class Card extends Deck {
    private int cardValue;
    private String suit;
    private boolean isFaceCard;
    private String faceCardType;
    public Card(int cardValue, String suitInput) {
        this.cardValue = cardValue;
        suit = suitInput;
    }
    public int getCardValue() {
        return cardValue;
    }
    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        suit = suit;
    }
    public boolean isFaceCard() {
        return isFaceCard;
    }
    public void setFaceCard(boolean faceCard) {
        isFaceCard = faceCard;
    }
    public String getFaceCardType() {
        return faceCardType;
    }
    public void setFaceCardType(String faceCardTypeInput) {
        faceCardType = faceCardTypeInput;
    }
}
