package twentyFive;

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1) ;
    }
}

