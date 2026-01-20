

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
        return "Customer [Name=" + Name + ", Age=" + Age + ", address=" + address + "]";
    }    

    
    
}
