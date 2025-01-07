package EightyFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        int num = 0;

//        try {
//            br = new BufferedReader(new InputStreamReader(System.in));
//            num = Integer.parseInt(br.readLine());
//            System.out.println(num);
//        } finally {
//            br.close();
//        }

        // This is called "try with resource"
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
