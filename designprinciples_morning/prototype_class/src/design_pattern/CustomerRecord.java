package design_pattern;

public class CustomerRecord implements Prototype1 {
	  private int id;  
	   private String name, prod_name;  
	   private double prod_cost;  
	   private String address;  
	      
	   public CustomerRecord(){  
	            System.out.println("  Customer Record ");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("cid"+"\t"+"cname"+"\t"+"pname"+"\t"+"pcost"+"\t\t"+"caddress");  
	      
	}  
	  
	 public  CustomerRecord(int id, String name, String prod_name, double prod_cost, String address) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.prod_name = prod_name;  
	        this.prod_cost = prod_cost;  
	        this.address = address;  
	    }  
	      
	  public void showRecord(){  
	          
	        System.out.println(id+"\t"+name+"\t"+prod_name+"\t"+prod_cost+"\t"+address);  
	   }  
	  
	    @Override  
	    public Prototype1 getClone() {  
	          
	        return new CustomerRecord(id,name,prod_name,prod_cost,address);  
	    }  

	 
}
