package programme_23_method_overriding;

/**
 * Creating a Child Class
 */
public class Bike extends Vehicle {

    // Defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is Running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike(); // Creating object
        obj.run(); // Calling Method
    }
}
