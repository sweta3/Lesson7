package com.lesson7;
import java.util.Scanner;
/**
Extra work on Characters, Strings and StringBuffers.
Write an application which reads in a sentence and then creates a new  word with all the spaces removed from the sentence. Use instantiable classes.
For example, if input is "I learn Java"
the output is:
"IlearnJava"
SpacesRemoverApp is an application which does the following tasks
-- prompts the user to input a sentence
-- uses the instantiable class SpacesRemover to create a word by removing all the spaces from the sentence
-- retrieves the word and dipslays it
*/

public class SpacesRemoverApp{
   public static void main(String args[]){
       // declare local variables
	   String sentence;
	   String word;
	   
	   SpacesRemover mySpacesRemover = new SpacesRemover(null, null);
	  
       // input
	   Scanner input = new Scanner(System.in);
       // input: prompt the user to provide a sentence
	   System.out.println("Please enter the sentece:");
	   sentence = input.nextLine();
	   
       // use the setter method to set the remover object's instance variable
	   // called sentence to the sentence provided by the user
	   mySpacesRemover.setSentence(sentence);
	   
       // processing: remove the spaces from the sentence
	   mySpacesRemover.removeSpaces();
	   
       // output the word created from the sentence:
       // first, retrieve the word using the getter getWord() on the object remover
       // second, display the word
	   word = mySpacesRemover.gerWord();
	   
       System.out.println("the word is: " + word);
       // Alternatively, we could write the above 2 statements in one line
       System.out.println("the word is: " + mySpacesRemover.gerWord());
   }
}