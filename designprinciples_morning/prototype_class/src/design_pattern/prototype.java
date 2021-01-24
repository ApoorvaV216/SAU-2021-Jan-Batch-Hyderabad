package design_pattern;
import java.io.*;
public class prototype {
	public static void main(String[] args) throws IOException {  
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter cutomer id: ");  
        int cid=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("Enter customer Name: ");  
        String cname=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter product name: ");  
        String pname=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter customer  Address: ");  
        String caddress=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter product cost: ");  
        double pcost= Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        CustomerRecord c1=new CustomerRecord(cid,cname,pname,pcost,caddress);  
          
        c1.showRecord();  
        System.out.println("\n");  
        CustomerRecord c2=(CustomerRecord) c1.getClone();  
        c2.showRecord();  
    }     

}
