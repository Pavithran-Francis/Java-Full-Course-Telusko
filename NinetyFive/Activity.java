package NinetyFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Activity {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator<String>() {
            public int compare(String s1, String s2){
                if (s1.length() > s2.length()){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1234");
        list.add("12345");
        list.add("12");
        list.add("123");

        Collections.sort(list, com);
        System.out.println(list);

    }
}
