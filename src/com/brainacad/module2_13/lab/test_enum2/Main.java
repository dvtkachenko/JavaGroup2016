package com.brainacad.module2_13.lab.test_enum2;

/**
 * Created by Дима on 10.02.2017.
 */

class Card {
    Main.Suit cardSuit;
    Main.Rank cardRank;

    public Card(Main.Suit cardSuit, Main.Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return String.format("The card : %s_%s", cardRank.toString(), cardSuit.toString());
    }
}

public class Main {

    enum Suit {SPADE, DIAMOND, CLUB, HEART}
    enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    public static void main(String[] args) {
        Card[] cards = new Card[52];
        int index = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[index++] = new Card(suit, rank);
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
