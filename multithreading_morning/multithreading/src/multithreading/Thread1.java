package multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread1 extends Thread {

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
        int countWord = 0; 
        try {
			while((line = reader.readLine()) != null) 
			{ 
			        String[] wordList = line.split("\\s+"); 
			          
			        countWord += wordList.length; 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
          
        System.out.println("Total word count = " + countWord); 
	}
}
