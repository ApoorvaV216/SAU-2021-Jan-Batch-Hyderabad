package multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread3 extends Thread {
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
        int paragraphCount = 1;  
        try {
			while((line = reader.readLine()) != null) 
			{ 
			    if(line.equals("")) 
			    { 
			        paragraphCount++; 
			    } 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        System.out.println("Number of paragraphs = " + paragraphCount); 
	}

}
