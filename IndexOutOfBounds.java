import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        //init array
        int[] a = new int[100];
        int i = 0;
        for (i = 0; i < 100; i++) {
            a[i] = new Random().nextInt();
        }
        //input index
        System.out.println("Please input index of arrray");
        int x = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                x = input.nextInt();
                System.out.println("The element of index is " + a[x]);
            } catch (InputMismatchException e1) {
                System.out.println("Input format error");
                input.nextLine();
            } catch (IndexOutOfBoundsException e2) {
                System.out.println("Out of Bounds");
                input.nextLine();
            }
        }
        input.close();
    }
}
