package Forty;

class Human {
    private String name;
    private int age; // Only accessible in the same class

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj =  new Human();
        obj.setAge(20);
        obj.setName("Pavithran");

//        obj.age = 20;
//        obj.name = "Pavithran";

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
