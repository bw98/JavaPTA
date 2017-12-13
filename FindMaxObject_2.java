import javax.naming.event.ObjectChangeListener;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.max;

public class FindMaxObject_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringArray = {new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next())};
        Integer[] integerArray = {new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt())};
        System.out.println("Max string is " + Max(stringArray));
        System.out.println("Max integer is " + Max(integerArray));
        input.close();
    }

    public static Object Max (Comparable[] a) {
        Object max = a[0];
        for (Comparable t : a) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}

