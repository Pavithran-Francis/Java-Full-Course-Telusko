package SixtyNine;

enum Status {
    Running, Failed, Pending, Success;
}


public class Demo {
    public static void main(String[] args) {
        Status s = Status.Pending;

        // Switch case supports enum as well
        // Switch is recommended in terms of enum
        switch (s) {
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                System.out.println("Success");
                break;
        }


//        if (s== Status.Running)
//            System.out.println("I'm running");
//        else if (s == Status.Failed)
//            System.out.println("I'm failed");
//        else if (s == Status.Pending)
//            System.out.println("I'm pending");
//        else
//            System.out.println("Done");
    }
}
