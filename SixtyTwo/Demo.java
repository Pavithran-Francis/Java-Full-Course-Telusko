package SixtyTwo;

class A { // Outer Class
    public void show() {
        System.out.println("In Show Method...");
    }

    static class B { // Inner Class
        public void config() {
            System.out.println("In Config Method...");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

//        A.B obj2 = obj.new B(); // This is used if the class is non-static

// Note - If the class is static you don't need to create an object
//      - Static cannot be used as an outer class
        A.B obj2 = new A.B();
        obj2.config();
    }
}
