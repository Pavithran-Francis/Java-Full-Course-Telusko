package SixtySeven;

interface A {
    void show();
    void config();
}

interface B {
    void run();
}

// An interface can extend another interface using the "extends" keyword
interface C extends B {
}

class X implements A, B {
    public void show() {
        System.out.println("In show method");
    }

    public void config() {
        System.out.println("In config method");
    }

    // Even if interface C doesn't have any methods it implements B
    // and B has the run method implemented
    public void run() {
        System.out.println("In run method");
    }
}

public class Demo {
    public static void main(String[] args) {

    }
}
