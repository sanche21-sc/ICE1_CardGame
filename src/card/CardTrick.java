/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @modifier AndresSanchez - 991771112
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue((int) (Math.random() * 13) + 1);
            //random number between 0-3
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        /*
        //insert code to ask the user for Card value and suit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int cardValue = input.nextInt();

        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades) : ");
        int cardSuit = input.nextInt();

        // create their card
        Card userCard = new Card();
        userCard.setValue(cardValue);
        userCard.setSuit(Card.SUITS[cardSuit]);

        // and search magicHand here
        Boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue() && c.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        //Then report the result here
        if (found) {
            System.out.println("Card found!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
         */
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        Boolean luckyCardFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
            }
        }

        if (luckyCardFound) {
            System.out.println("Lucky Card found!");
        } else {
            System.out.println("Lucky Card not found.");
        }
    }

}
