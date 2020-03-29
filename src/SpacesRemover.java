package com.lesson7;
/**
Extra work on Characters, Strings and StringBuffers.
Write an application which reads in a sentence and then creates a new  word with all
the spaces removed from the sentence Use instantiable classes.
For example, if input is "I learn Java"
the output is:
"IlearnJava"
SpacesRemover -- the instantiable class: given a sentence, creates a new word by removing all
the spaces from the sentence
*/
public class SpacesRemover{
   // declare data members / instance variables
	private String sentence;
	private String word;
	
	
   // declare a constructor without parameters
	public SpacesRemover(String sentence, String word) {
		// initialize the sentence with the empty string, otherwise the sentence 
		// instance variable is initialized with null
		// initialize the word with the empty string, otherwise
		// the word instance variable is initialized with null
		this.sentence=sentence;
		this.word=word;	
	}
  
	// declare setter methods
	public void setSentence(String sentence) {
		this.sentence=sentence;
	}
	
	public void setWord(String word) {
		this.word=word;
	}
	
	// declare getter methods
	public String getSentence() {
		return sentence;
	}
	
	public String gerWord() {
		return word;
	}
	
   // processing: given a sentence, creates a new word by removing all the spaces from the sentence
       // declare a variable named sb of type StringBuffer AND create an instance/object of StringBuffer 
	   // to be able to build a new word (remember: Strings are immutable -- i.e. cannot be modified)
	public void removeSpaces() {
	StringBuffer sb = new StringBuffer();
       // traverse the entire sentence in for loop,
            // retrieve the current character at the index i
            // in each iteration check whether the current character is a space, 
			// if it isn't add the character to the buffer sb
            // save in the instance variable named word the String representation of the sb buffer
	int length = sentence.length();
	for(int i = 0; i<length; i++) {
	      if (sentence.charAt(i) != ' ') {         
	    	 sb.append(sentence.charAt(i));           
	         }              
	      }
	word = sb.toString();
		}
}

