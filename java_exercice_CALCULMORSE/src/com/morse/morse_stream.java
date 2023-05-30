package com.morse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class morse_stream {

	private StringBuilder SB = null;
	
	public morse_stream()
	{
	}
	  
	//chargement du fichier
    public InputStream getFileAsIOStream(final String fileName) 
    {
       
    	InputStream ioStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
       
        if (ioStream == null) 
        
        {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }
    
    
    
    
  //affiche le résultat
    public void printFileContent(InputStream istream, int switcher) 
    {
    	
    try {
    	
    	SB=new StringBuilder();
    	
    	InputStreamReader ireader = new InputStreamReader(istream);
        
        BufferedReader buffer = new BufferedReader(ireader);
        
        String line = "";
               
        while ((line = buffer.readLine()) != null) 
        {
        	
        		if(switcher == 0)//cas texte en morse
        		{
        			SB.append(morse_Traductor.Traductor_TextToMorse(line)+"\n");
        		}
        		else 	//cas  morse en texte
        		{
        			SB.append(morse_Traductor.Traductor_MorseToText(line)+"\n");
        			
        		}
        	
        	        	
        	System.out.println(SB);
        }
      
        
        //Ecriture dans le fichier qui est créé auto si non existant
        this.WriteTextIntoFile("data/output.txt", SB);        
        
        	buffer.close();
      
       } 
      catch (IOException e) 
      {
      
        e.printStackTrace();
        
       }

    }

    
    
  //Fonction pour écrire le texte dans le fichier
    public void WriteTextIntoFile(String fileName, StringBuilder textToWrite)
    {
    	//System.out.println(textToWrite);
    	
    	//init buffer pour l'écriture
    	BufferedWriter writer = null;
    	
    	//dans un try catch pour gestion d'erreur
        try {
        	//init du writer 
            writer = new BufferedWriter(new FileWriter(fileName));
            
            //on dump la stringbuilder et écrire le texte dans le fichier
            writer.append(textToWrite);
        
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try {
                // fermeture du flux
                writer.close();
	            } 
	            catch (Exception e) 
	            {
	            	
	            }
        }
    }
	
}
