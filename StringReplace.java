import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String s1 = s.replaceAll("ba", "123");
        System.out.println(s1);

    }
}


/*
INPUT:
Xi’an Institute of Posts and Telecommunications is co-designed and implemented by the People’s Government of Shaanxi Province and the Ministry of Industry and Information Technology.
The Institute is located in Xi’an, a historic city in Northwest China, famous for its magnificent ancient culture.
end
Institute
University

OUTPUT:
Xi’an University of Posts and Telecommunications is co-designed and implemented by the People’s Government of Shaanxi Province and the Ministry of Industry and Information Technology.
The University is located in Xi’an, a historic city in Northwest China, famous for its magnificent ancient culture.
*/

import java.math.BigInteger;
import java.util.*;
//import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = new String(),temp = new String();

        while(input.hasNext()) {
            temp = input.nextLine();
            if (temp.equals("end")) {
                break;
            }
            else {
                s = s + temp;
            }
        }

        String s1 = new String(input.next());
        String s2 = new String(input.next());
        String s3 = s.replaceAll(s1, s2);
        System.out.println(s3);
        input.close();
    }
}
