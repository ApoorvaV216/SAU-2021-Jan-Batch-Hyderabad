package xml.to.objects;
import java.util.ArrayList;
import java.util.List;  
import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="students")
public class Students {
    private int id;
	private String standard;
	private ArrayList<Student>student;
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@XmlElement
	public ArrayList<Student> getStudent() {
		return student;
	}
	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}
	public Students(int id, String standard, ArrayList<xml.to.objects.Student> student) {
		super();
		this.id = id;
		this.standard = standard;
		this.student = student;
	}
	public Students() {
		super();
	}
	
	
}
