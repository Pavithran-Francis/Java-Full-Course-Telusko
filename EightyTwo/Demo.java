package EightyTwo;

class A {
    public void show() throws ClassNotFoundException {
//        try {
//            Class.forName("Demo0");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Not able to find class");
//        }

        Class.forName("Calc");
    }
}
public class Demo {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
