
package w2017week2;

/**
 *
 * @author BradT
 */
public class PlayingCard 
{
    private String faceName, suit;
    private int faceValue;
    
    public PlayingCard(String face, String suit, int value)
    {
        faceName = face;
        setSuit(suit);
        setValue(value);
    }
    
    public static void main(String[] args) 
    {
        PlayingCard myFirstCard = new PlayingCard("Ace", "spades", 14);
        System.out.printf("My Card is: %s%n", myFirstCard);
        
        PlayingCard mySecondCard = new PlayingCard("Ace", "hearts", 14);
        System.out.printf("My Card is: %s%n", mySecondCard);
    }
    /**
     * This method will validate if the suit is valid (i.e. hearts, diamonds,
     * spades or clubs)
     */
    private void setSuit(String suit)
    {
        if(suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds")
                || suit.equalsIgnoreCase("spades") || suit.equalsIgnoreCase("clubs"))
        {
            this.suit = suit;
        }
        else
            throw new IllegalArgumentException("suit must be hearts, diamonds, clubs " + "or spades");
        
    }
    
    /**
     * This method will validate that the input is between 2-14 and set the card
     * value accordingly.
     */
    private void setValue(int value)
    {
        if(value < 2 || value > 14)
            throw new IllegalArgumentException("Face value must be 2-14 inclusive");
        else
            faceValue = value;
    }
    
    /**
     * This method will return a String to represent the Card
     */
    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
    
    DeckOfCards theDeck = new DeckOfCards();
    
} 
