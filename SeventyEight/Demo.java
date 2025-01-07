package SeventyEight;

public class Demo {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        }
//        catch (Exception e) {
//            System.out.println("Something went wrong : " + e);

//            Note : You can form an if condition too by checking the error type

//            if(e instanceof ArithmeticException) {
//                System.out.println("Cannot divide by zero");
//            } else if (e instanceof ArrayIndexOutOfBoundsException) {
//                System.out.println("Index entered is larger than the actual count of values");
//            }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
