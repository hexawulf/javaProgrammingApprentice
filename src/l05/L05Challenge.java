package l05;

public class L05Challenge {

    public static void main(String[] args) {
        
    	//Create customer with 2 parameter constructor
    	
    	Customer customer = new Customer("Tim", "email@email.com");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.geteMailAddress());
        System.out.println("\n");
        
        //Create customer with no args constructor
        Customer customer02 = new Customer();
        System.out.println("Customer Name: " + customer02.getName());
        System.out.println("\n");
        
        
        //Create customer with 3 parameter constructor
        Customer customer03 = new Customer("Wolf", 500000, "wolf@wolf.com");
        System.out.println("Customer Name: " + customer03.getName());
        System.out.println("Customer Credit Limit: " + customer03.getCreditLimit());
        System.out.println("Customer Email: " + customer03.geteMailAddress());
               
        
    }
}

class Customer {
    private String name;
    private int creditLimit;
    private String eMailAddress;

    // Getters methods
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

 // Master constructor with three parameters
    public Customer(String name, int creditLimit, String eMailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAddress = eMailAddress;
    }

    // No-arg constructor
    public Customer() {
        this("Unknown", 0, "Unknown");  // Call the master constructor with default values
    }

    // Constructor with two parameters, name and emailAddress
    public Customer(String name, String eMailAddress) {
        this(name, 0, eMailAddress);  // Call the master constructor with default creditLimit
    }
}
