import java.util.Arrays;
import java.util.Scanner;

public class stringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);

    }
}
