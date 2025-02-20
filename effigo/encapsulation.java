package effigo;

public class encapsulation
{
	 private String name; 
	   
	    public void setName(String newName) {
	        name = newName;
	    }

	    public String getName() {
	        return name;
	    }
public static void main(String[] args) {
    encapsulation emp = new encapsulation(); 
    emp.setName("Dharunya"); 
    System.out.println(emp.getName()); 
}
}