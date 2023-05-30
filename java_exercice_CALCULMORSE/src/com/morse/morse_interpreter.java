package com.morse;

import java.util.*;

public class morse_interpreter {
	
	
	//tableau code de base
	   private static String[] codeMorse()
	   {
		// par mode index
	    String[] code = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", "....."
	    			, "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---"
					, "-.-",".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
					".--", "-..-", "-.--", "--.." };
	    
	    return code;
	   }

	 //tableau code alphabet
	   private static String[] codeAlpha()  
	   {
		// par mode index
		   String[] codeAlpha = {" ", ",", ".", "?", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
					"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
			 			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	   
		   return codeAlpha;
	   }
	   

	   //list des 2 tableaux
	   public static Map<String,String> GetListCode()
	   {
		  	   
		   Map<String,String> morseCode = new HashMap<>();
		   
		   for (int i = 0; i <codeAlpha().length; i++) 
		   {
	       	
			   morseCode.put(codeAlpha()[i],codeMorse()[i]);		   
	       }
	       	   
		   return morseCode;
		  
	   }
	

}
