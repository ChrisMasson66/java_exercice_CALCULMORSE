package com.morse;


import java.io.InputStream;


public class morse_main {

	public static void main(String[] args) 
	{
	

	     //init du stream pour l'appel du fichier input.txt	    	  
	       morse_stream stream = new morse_stream();
	        //on passe le fichier
		   InputStream istream = stream.getFileAsIOStream("input.txt");
		    //et on print en passant un int si 'lon veux etlle ou telle traduction
		   stream.printFileContent(istream,1);
	}
		    
}