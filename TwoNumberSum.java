import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        while(true) {
            try {
                a = input.nextInt();
                b = input.nextInt();
                break;
            } catch (InputMismatchException ex) { //直接写异常父类Exception
                System.out.println("Input match error");
                input.nextline();
            }
        }
        System.out.println("Input Successfully and sum is " + (a+b));
        input.close();
    }
}
