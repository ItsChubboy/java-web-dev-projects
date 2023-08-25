package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String HiddenQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("Please enter a quote: ");
        String newQuote = input.nextLine().toLowerCase();
        char[] charactersInString = newQuote.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();

        for(int i=0; i < charactersInString.length; i++) {
            if(!characters.containsKey(charactersInString[i])) {
                characters.put(charactersInString[i], 1);
            } else {
                characters.put(charactersInString[i], characters.get(charactersInString[i]) + 1);
            }
        }
        System.out.println(characters);
        input.close();
    }
}