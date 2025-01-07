package EightyOne;

class PavithranException extends RuntimeException{
    public PavithranException(String string) {
        super(string);
    }
}

public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;

            if (j==0) {
                throw new PavithranException("I dont want to print Zero");
            }
        } catch (PavithranException e) {
            j = 18/1;
            System.out.println("That's the default output : " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
