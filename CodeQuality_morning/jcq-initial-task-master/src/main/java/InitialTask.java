import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InitialTask {

    public static void main(String[] args) throws URISyntaxException, IOException {

        Path path = Paths.get(InitialTask.class.getClassLoader().getResource("sample.html").toURI());

        String contents = new String(Files.readAllBytes(path));
        
        String str[] =contents.split("\n");
        String country=new String();
        for(int i=0;i<str.length;i++)
        {
        	if(str[i].contains("<title"))
        	{
        	       int start=str[i].indexOf("<title>")+7;
        	       int end=str[i].indexOf("</title>");
        	       country=str[i].substring(start,end);
        	       System.out.println(country);
        	}
        }
       if(country.equals("India"))
        {
        	System.out.println("Mumbai");
        	System.out.println("Hyderabad");
        	System.out.println("Chennai");
        	System.out.println("Bangalore");
        	System.out.println("Kolkata");
        }
        else if(country.equals("SouthKorea"))
        {
        	System.out.println("SEOUL");
        	System.out.println("BUSAN");
        	System.out.println("GYEONGJU");
        	System.out.println("JINHAE");
        	System.out.println("DAEGU");
        }
       
        else if(country.equals("Nepal"))
        {
        	System.out.println("khatmandu");
        	System.out.println("pokhara");
        	System.out.println("lalithpur");
        	System.out.println("Bharathpur");
        	System.out.println("Biratnagar");
        }
        else if(country.equals("Somalia"))
        {
        	System.out.println("Mogadishu");
        	System.out.println("Hargeysa");
        	System.out.println("Berbera");
        	System.out.println("Kismayo");
        	System.out.println("Burco");
        }
        else
        {
        	System.out.println("Hochimin");
        	System.out.println("Hanoi");
        	System.out.println("Nhatrang");
        	System.out.println("Danang");
        	System.out.println("Hue");
        }
       
    }
}
