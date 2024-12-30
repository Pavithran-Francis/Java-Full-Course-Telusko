package SixtyFour;

// Anonymous inner class using abstract classes
// Implementing the inner class using an abstract class

abstract class A {
    public abstract void show();
    public abstract void config();
}

//class B extends A {
//    public void show() {
//        System.out.println("In B show");
//    }
//}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            // U cant create an object of an abstract class
            // Here you are creating an object of the anonymous inner class
            // Demo$1.class
            public void show() {
                System.out.println("In new show");
            }

            public void config() {
                System.out.println("In new config");
            }
        };
        obj.show();
        obj.config();
    }
}
