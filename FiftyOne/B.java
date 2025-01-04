package FiftyOne;

public class B extends A{
    public B() {
        super();
        System.out.println("In B");
    }

    public B(int n) {
        this(); // Executes the constructor of the same class
        System.out.println("In B int");
    }

}
