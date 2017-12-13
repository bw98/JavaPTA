import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.util.Scanner;

public class phoneBook {
    public static void main(String[] args) {
        String s, temp, s2;
        s = new String();
        Scanner input = new Scanner(System.in);
        do {
            temp = input.nextLine();
            s += temp;
            s += ' ';
        } while (!temp.equals("noname"));
        //search
        s2 = input.next();
        if (s.indexOf(s2) != -1) {
            int index;
            index = s.indexOf(s2) + s2.length() + 1;
            char[] temp2 = s.toCharArray();
            int count;
            for (count = index; temp2[count] != ' '; count++) {
                System.out.print(temp2[count]);
            }
        }
        else if (s.indexOf(s2) == -1)
            System.out.println("Not found.");
    }
}

