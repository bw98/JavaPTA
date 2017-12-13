import java.util.Scanner;

public class stringReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String s1 = s.replaceAll("ba", "123");
        System.out.println(s1);

    }
}
