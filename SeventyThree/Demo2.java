package SeventyThree;
 /*
 If you use lambda expression it doesn't create a separate file when compiling like "$1" but the Main file will get heavy
 in this case it is the Demo File.
*/

@FunctionalInterface
interface B {
    void show(int i);
}
public class Demo2 {
    public static void main(String[] args) {
        // Version 1 : implementation inside the brackets
        B obj1 = (int i) ->
        {
                System.out.println("In Show " + i);
        };
        obj1.show(1);

        // Version 2 : the parameter type doesn't need to be mentioned
        B obj2 = (i) -> System.out.println("In Show " + i);
        obj2.show(2);

        // Version 3 : If only 1 parameter then you don't even need brackets
        B obj3 = i -> System.out.println("In Show " + i);
        obj3.show(3);
    }
}

