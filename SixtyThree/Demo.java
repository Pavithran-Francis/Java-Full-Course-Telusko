package SixtyThree;

class A {
    public void show() {
        System.out.println("In A Show");
    }
}

// If B has only one implementation why create a separate class for that?
// Rather create a anonymous inner class
class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                // Here you are passing an implementation
                // This is called an anonymous class (Demo$1)
                // This is the inner class (Class inside demo)
                System.out.println("In New Show");
            }
        };
        obj.show();
    }
}
