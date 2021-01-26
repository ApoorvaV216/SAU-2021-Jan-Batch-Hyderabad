package multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread2 extends Thread {
	public void run()
	{
		File file = new File("C:\\Users\\vedan\\Desktop\\Book.txt"); 
        FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line;  
        int sentenceCount = 0; 
          
        // Reading line by line from the  
        // file until a null is returned 
        try {
			while((line = reader.readLine()) != null) 
			{ 
			        String[] sentenceList = line.split("[!?.:]+"); 
			          
			        sentenceCount += sentenceList.length; 
			    
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
           
        System.out.println("Total number of sentences = " + sentenceCount); 
	}
}