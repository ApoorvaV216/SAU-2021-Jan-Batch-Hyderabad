package codequality;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apoorva extends Thread {
   public void run()
   {
	   File file = new File("C:\\Users\\vedan\\Desktop\\Book.txt"); 
	    FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	    InputStreamReader input = new InputStreamReader(fileStream); 
	    BufferedReader reader = new BufferedReader(input); 
	    String line; 
	    int countWord = 0; 
	    int sentenceCount = 0;  
	    int paragraphCount =1;
	    try {
			while((line = reader.readLine()) != null) 
			{ 
			    if(line.equals("")) 
			    { 
			        paragraphCount++; 
			    } else { 
			        String[] wordList = line.split("\\s+"); 
			          
			        countWord += wordList.length; 
			        String[] sentenceList = line.split("[!?.:]+"); 
			          
			        sentenceCount += sentenceList.length; 
			    } 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	      
	    
	    System.out.println("Total word count = " + countWord); 

	    System.out.println("Total number of sentences = " + sentenceCount); 
	    	    System.out.println("Number of paragraphs = " + paragraphCount); 
	    
	   
	
   }
}