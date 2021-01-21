package text.to.csv;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class Main2 {
		   public static void main(String[] args) {
		      try (BufferedReader br = new BufferedReader(new FileReader("‪C:\\Users\\vedan\\Desktop\\Students.txt"))) {
		         String s;
		         PrintWriter writer = new PrintWriter(new File(‪"C:\\Users\\vedan\\Desktop\\Students.csv"));

		            StringBuilder sb = new StringBuilder();
		            sb.append("id ");
		            sb.append(',');
		            sb.append("Total");
		            sb.append('\n');
		         while ((s= br.readLine()) != null) {
		        	sb.append(s+"\n");
		            }
		         writer.write(sb.toString());
		            writer.close();
		         } 
		         catch (Exception e) {
		         e.printStackTrace();
		      }
		   }
		}


