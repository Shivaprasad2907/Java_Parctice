import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class MyHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(); 
		HashMap hm = new HashMap();
		  Customer c1 = new Customer("Shiva", 25, new Address("11-15-37/1", "RD: 1",  "Hyderabad", "TG", "500035"));
	        Customer c2 = new Customer("Rama", 26, new Address("11-15-37/3","rd: 2","Hyderabad","TS","500035"));
	        Customer c3 = new Customer("raghu", 35, new Address("11-37/3","rd: 9","Hyderabad","TS","500037"));


	        Customer c5 = new Customer("Shiv", 25, new Address("11-15-37", "RD: 1",  "Hyderabad", "TG", "500035"));
	        Customer c6 = new Customer("Ram", 26, new Address("11-3","rd: 2","Hyderabad","TS","500035"));
	        Customer c7 = new Customer("sita", 35, new Address("11-37/3","rd: 9","Hyderabad","TS","500037"));
	        
	        hm.put("1",c1);
	         hm.put("2",c2);
	         hm.put("3", c3);
	         hm.put("4", c5);
	         hm.put("5", c6);
	         hm.put("6", c7);
	         
	        
	        v.add(c1);
	        
	        
	        
	        System.out.println(v);
	        
	        
	        for(int i=0; i<hm.size(); i++)  {
	        	System.out.println("\n" + hm.get(i));
	        }
	        

	}

}

class Address {
    String Hno;
    String Street;
    String City;
    String State;
    String Pincode;


    Address(String Hno, String Street, String City, String State, String Pincode) {
        this.Hno = Hno;
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.Pincode = Pincode;

    }
}

class Customer {

    String Name;
    int Age;
    Address address;

    Customer(String name, int age, Address address) {
        this.Name = name;
        this.Age = age;
        this.address = address;
    }

	@Override
	public String toString() {
		return ("\n " + 
	"Name: " + Name + ",\nAge=" + Age 
				+ ", \nH.no:" + address.Hno + " Street:" + address.Street 
				+ " City: " + address.City + " State: " + address.State + " Pincode: " + address.Pincode);
	}    
    
}