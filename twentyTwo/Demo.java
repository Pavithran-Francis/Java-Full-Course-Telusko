package twentyTwo;

class Calculator {
    int a;

    public int add(int num1, int num2) {
        System.out.println("Inside add method");
        System.out.println("Leaving add method");
        return num1 + num2;
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator calculator = new Calculator();

        int result = calculator.add(num1, num2);

        System.out.println("Result: " + result);

//        int result = num1 + num2;
//        System.out.println(result);
    }
}

// Object-Oriented Programming
// Object - Properties and Behaviours

// Class
