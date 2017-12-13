import java.util.Scanner;

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        s1 = new String(input.next());
        s2 = new String(input.next());
        while( (!s1.isEmpty()) && (!s2.isEmpty()) ) {
            printLongestPrefix(s1,s2);
            s1 = input.next();
            s2 = input.next();
        }
        input.close();
    }
    static void printLongestPrefix (String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("No common prefix");
            return;
        }
        if ((s1.isEmpty() && !s2.isEmpty()) || (!s1.isEmpty() && s2.isEmpty())) {
            System.out.println("No common prefix");
            return;
        }
        int index;
        String temp = new String("");
        for (index = 0; index < s1.length(); index++ ) {
            if ((index+1 > s2.length()) && (!temp.isEmpty())) {
                System.out.println("The common prefix is " + temp);
                break;
            }
            if (s1.charAt(index) == s2.charAt(index)) {
                temp += s1.charAt(index);
            }
            if ((s1.charAt(index) != s2.charAt(index)) && (temp.isEmpty())) {
                System.out.println("No common prefix");
                break;
            }
            if ((s1.charAt(index) != s2.charAt(index)) && (!temp.isEmpty())) {
                System.out.println("The common prefix is " + temp);
                break;
            }
        }

        return;
    }
}
