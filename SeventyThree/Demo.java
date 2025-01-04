package SeventyThree;

// Lambda expression only work with functional interface
@FunctionalInterface
interface A {
    void show();
}
public class Demo {
    public static void main(String[] args) {
        A obj = () -> {
            // If you have multiple lines you should put it inside the curly brackets
            // If not you don't need to put the curly braces
            System.out.println("In Show");
        };
        obj.show();
    }
}
