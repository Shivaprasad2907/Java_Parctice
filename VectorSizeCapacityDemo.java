// package CL;
import java.util.Vector;

// import Cllections.Cutomer;

public class VectorSizeCapacityDemo {

    public static void main(String[] args) {
        // Create a vector with initial capacity of 10
        Vector v = new Vector(3);
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("Initial size: " + v.size());

        System.out.println();
        // creating Customer Deteails

        Customer c1 = new Customer("Shiva", 25, new Address("11-15-37/1", "RD: 1",  "Hyderabad", "TG", "500035"));
        Customer c2 = new Customer("Rama", 26, new Address("11-15-37/3","rd: 2","Hyderabad","TS","500035"));
        Customer c3 = new Customer("raghu", 35, new Address("11-37/3","rd: 9","Hyderabad","TS","500037"));


        Customer c5 = new Customer("Shiv", 25, new Address("11-15-37", "RD: 1",  "Hyderabad", "TG", "500035"));
        Customer c6 = new Customer("Ram", 26, new Address("11-3","rd: 2","Hyderabad","TS","500035"));
        Customer c7 = new Customer("sita", 35, new Address("11-37/3","rd: 9","Hyderabad","TS","500037"));

        v.add(c1);
        v.add(c2);
        v.add(c3);

        System.out.println("Adding c1 to c3");
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("Initial size: " + v.size());

        System.out.println();
        // creating Customer Dete
        v.add(c5);
        v.add(c7);
        v.add(c6);

        System.out.println("After Adding c5 to c7");
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("Initial size: " + v.size());

        // System.out.println(v.get(c1));

        for(int i=0; i<v.size(); i++){
            System.out.println(v.get(i));
        }

        
       

    }
}
