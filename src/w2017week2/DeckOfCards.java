/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2017week2;

import java.util.ArrayList;

/**
 *
 * @author BradT
 */
public class DeckOfCards {
    ArrayList<PlayingCard> deck;
   
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        
        String[] suits = {"hearts", "diamonds", "spades", "clubs"};
        String[] faceNames = {"two", "three", "four", "five", "six", "seven", "eight",
                                "nine", "ten", "jack", "queen", "king", "ace"};
        
        for(String suit: suits)
        {
            for (int i=0; i < faceNames.length; i++)
            {
                PlayingCard newCard = new PlayingCard(faceNames[i], suit, i+2);
                deck.add(newCard);
            }
        }
    }
    
    /**
     * This will return a String representing the deck of cards
     */
    public String toString()
    {
        String deckString = "";
        
        for(PlayingCard card : deck)
        {
            deckString += card.toString() + "%n";
        }
        
        return deckString;
    }
}
