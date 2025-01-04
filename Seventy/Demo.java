package Seventy;

enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Demo {
    public static void main(String[] args) {
//        Laptop laptop = Laptop.Macbook;
//        System.out.println(laptop + " : " + laptop.getPrice());

        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}
