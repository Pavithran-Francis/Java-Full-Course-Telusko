package twentyFour;

class Computer {
    public void playMusic() {
        System.out.println("Music is playing!");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        } else {
            return "No Pen";
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.playMusic();
        String str = com.getMeAPen(3);
        System.out.println(str);
    }
}
