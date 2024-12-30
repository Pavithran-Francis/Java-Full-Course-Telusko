package SixtyEight;

// Named Constants
enum Status {
    Running, Failed, Pending, Success;

}

public class Demo {
    public static void main(String[] args) {
//        Status s1 = Status.Failed;
//        System.out.println(s1);
//
//        Status s2 = Status.Success;
//        System.out.println(s2);

//        Status s3 = Status.NoIdea;
//        System.out.println(s3);

//        Status s4 = Status.Running;
//        System.out.println(s4.ordinal()); // Prints the index

        Status[] sArray = Status.values();
        for (Status s : sArray) {
            System.out.println(s + " : " + s.ordinal());
        }

    }
}
