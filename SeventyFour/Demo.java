package SeventyFour;

@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class Demo {
    public static void main(String[] args) {
//        A obj = new A() {
//            public int add(int i, int j) {
//                return i + j;
//            }
//        };
//
//        int result = obj.add(5, 4);
//        System.out.println(result);

        // You cant specifically mention the keyword return, but it is assumed that it is the return type by the compiler
        A obj = (i, j) -> i+j;

        int result = obj.add(5, 4);
        System.out.println(result);

    }
}
