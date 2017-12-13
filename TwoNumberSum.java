import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner input = null;
        int a = 0, b = 0;
        boolean flag = false;
        while(!flag) {
            try {
                input = new Scanner(System.in);
                a = input.nextInt();
                b = input.nextInt();
                flag = true;
            } catch (InputMismatchException ex) {
                System.out.println("Input match error");
                flag = false;
            }
        }

        System.out.println("Input Successfully and sum is " + (a+b));
        input.close();
    }
}
