package NinetyThree;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

//        nums.add(6);
//        nums.add("5");

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }

//        for (Object n : nums) {
//            System.out.println(n);
//        }
    }
}
