package SixtyFive;

interface A {
    // Every variable in the interface is by default final and static
    // Since the variables are static these can be directly called using the interface name
    // It is compulsory to declare AND initialise the variables
    // You can't directly call the interface name and modify the variables as they are final
    int age = 20;
    String areaName = "Colombo";

    // All methods in an interface are by default - public abstract methods
    void show();
    void config();
}

class B implements A {
    // If you don't define all the methods in the interface by default the child class would become an abstract class
    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj; // U can create a reference of an interface
        obj = new B();
        obj.config();
        obj.show();

        System.out.println(A.areaName);
        System.out.println(A.age);

    }
}
