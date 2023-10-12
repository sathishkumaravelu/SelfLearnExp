package javaLearning;

public class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
    }


    public static void main(String[] args) {
        // Creating an object of the Customer class
        // Using the object to display customer information
        Customer customer1 = new Customer("John Doe", 30);
        customer1.displayInfo();
    }

}

