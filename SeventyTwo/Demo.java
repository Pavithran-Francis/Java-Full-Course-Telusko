package SeventyTwo;

// An interface with one method is called a functional interface
// or SAM (Single Abstract Method Interface)
@FunctionalInterface
interface A {
    void show();
}

//class B implements A {
//    public void show() {
//        System.out.println("B");
//    }
//}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
