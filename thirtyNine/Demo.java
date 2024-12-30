package thirtyNine;

class Mobile {
    String brand;
    int price;
    static String name;

    static { // To set the static variable and is called only once
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println("\nBrand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");

//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 1500;
//        Mobile.name = "Smartphone";
//
//        Mobile obj2 = new Mobile();

    }
}
