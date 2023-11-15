package programme_encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        // Setting values of the variables
        obj.setName("Nikhil");
        obj.setAge(42);
        obj.setRollNo(3);

        // Displaying values of the variables
        System.out.println("My name    : " + obj.getName());
        System.out.println("My Age     : " + obj.getAge());
        System.out.println("My Roll No : " + obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation
        // System.out.println("Prime's rollNo : " + obj.geekName);
    }
}
