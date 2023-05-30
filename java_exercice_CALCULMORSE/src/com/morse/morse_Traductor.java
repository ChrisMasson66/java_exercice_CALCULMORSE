package com.morse;

import java.util.*;


public class morse_Traductor {
	
	private static final  String CHAR_SEPARATOR = " ";
	
	public morse_Traductor()
	{
		
	}
	
	
	//traduit le text en mosre
	public static StringBuilder Traductor_TextToMorse(String line)
	{
		StringBuilder sb=new StringBuilder();
		
	//	System.out.println(line);
		
		String	code  = "";
		
		String[] words = line.split(CHAR_SEPARATOR);
		
		for (String word : words) 
		{
			//System.out.println(word);
			
			char[] letters = word.trim().toCharArray();
			
			//System.out.println(Arrays.toString(letters));
								
			for (char letter : letters) 
				{
				
					//System.out.println(Character.toString(letter));
					
				code = TextToMorse(Character.toString(letter).toUpperCase()) + ' ';
				
				sb.append(code);
					
				}
			
			
		
		}
	
		
		return sb;
	}
	
	///traducteur de lettre	
	private static String TextToMorse(String s)
	{
		//System.out.println(s);
		
		for (Map.Entry<String,String> CodeList : morse_interpreter.GetListCode().entrySet()) 
		{
			   
		//System.out.println("Key = " + CodeList.getKey() +", Value = " + CodeList.getValue());
			
		
		 if(CodeList.getKey().contentEquals(s))
			{
				//System.out.println(CodeList.getValue());
				
				return CodeList.getValue();
				
			}
			
	
		}
		
		throw new IllegalArgumentException(s + " non valide");
		
	}
	
	
		
	//traduit le morse en texte
	public static StringBuilder Traductor_MorseToText(String line)
	{
		StringBuilder sb=new StringBuilder();
		
		//System.out.println(line+" #");
		
		String	word  = "";
		
		String[] codes = line.split(CHAR_SEPARATOR);
		
		for (String code : codes) 
		{
			//System.out.println(code+" #");
			
			//System.out.println(Character.toString(letter));
			
			word = MorseToText(code);
			
			sb.append(word);
		
		}
	
		
		return sb;
	}
	
	
	//traducteur de code
	private static String  MorseToText(String s)
		{
		String res = "";
		String ret = " ";
		
		if(s.equals(res))
		{
			return ret;
		}
		else
		{
			
			//utilise le tableau pour comparaison
			for (Map.Entry<String,String> CodeList : morse_interpreter.GetListCode().entrySet()) 
			{
		
				if(CodeList.getValue().equals(s))
				{ 
					//retourne la clé, donc un caractère alpha
					return CodeList.getKey();
					
				}  
			}

			
			throw new IllegalArgumentException(s + " non valide");
			
		}
		

			
		}
			
		
		
		



}
