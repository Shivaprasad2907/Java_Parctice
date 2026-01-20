import java.util.ArrayList;


public class MyArrayListDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        Customer c1 = new Customer("Shiva", 25, new Address("11-15-37/1", "RD: 1",  "Hyderabad", "TG", "500035"));
        Customer c2 = new Customer("Rama", 26, new Address("11-15-37/3","rd: 2","Hyderabad","TS","500035"));
        Customer c3 = new Customer("raghu", 35, new Address("11-37/3","rd: 9","Hyderabad","TS","500037"));


        Customer c5 = new Customer("Shiv", 25, new Address("11-15-37", "RD: 1",  "Hyderabad", "TG", "500035"));
        Customer c6 = new Customer("Ram", 26, new Address("11-3","rd: 2","Hyderabad","TS","500035"));
        Customer c7 = new Customer("sita", 35, new Address("11-37/3","rd: 9","Hyderabad","TS","500037"));

        list.add(c1);
        list.add(c2);

        System.out.println(list);
    
}
}

