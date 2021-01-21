package xml.to.objects;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 
import java.io.File;
import java.util.List;  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			File file = new File("C:\\Users\\vedan\\eclipse-workspace\\fundamentals1\\src\\students.xml");  
			    JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);  
   
			    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
			    Students stu= (Students) jaxbUnmarshaller.unmarshal(file);  
			      
			    System.out.println(stu.getId()+" "+stu.getStandard());  
			    System.out.println("list of students in this standard is:");
			    List<Student> list=stu.getStudent(); 
			    FileWriter myWriter = new FileWriter("Students.txt");
			    myWriter.write("RollNo Marks Subject");
			    for (Student obj:list)
			    {
			    	 myWriter.write(obj.getRoll()+" "+obj.getMarks()+" "+obj.getSubject());
			    	 }
		        
		  myWriter.close();
		  }
		  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
