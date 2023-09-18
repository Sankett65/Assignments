package com.assignment.assignment_day11_day12;

//
//        Write a Program DeckOfCards.java, to initialize deck of cards having suit
//        ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
//        "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
//        method and then distribute 9 Cards to 4 Players and Print the Cards received by
//        the 4 Players using 2D Array...

import java.util.*;

public class DeckOfCard {

    public static  void deck() {
        String[] array1 = {"Clubs", "Diamonds", "Hearts", "Spades"};
        List<String > suit=new ArrayList<>();
        for (int i =0;i<array1.length;i++){
            suit.add(array1[i]);
        }
        String[] array2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        List<String > Rank=new ArrayList<>();
        for (int i =0;i<array2.length;i++){
            Rank.add(array2[i]);
        }

        List<String > deck=new ArrayList<>();

        for (int i =0;i<suit.size();i++){
            for (int j =0;j<Rank.size();j++){
                deck.add(suit.get(i)+" "+Rank.get(i));
            }
        }
      //  System.out.println(deck.size());

        Collections.shuffle(deck, new Random());

        int players = 4;
        int cardsPerPlayer = 9;
        String[][] playersHands = new String[players][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersHands[i][j] = deck.get(cardIndex);
                cardIndex++;
            }
        }

        for (int i = 0; i <players; i++) {
            System.out.println("\nPlayer " + (i +1)+" :-");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.print(playersHands[i][j]+"  |  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        deck();
    }
}
