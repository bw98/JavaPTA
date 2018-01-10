/*
7-4 找出最大的对象（10 分）
（找出最大的对象）编写一个方法，返回对象数组中最大的对象。方法签名如下： public static Object max(Comparable[] a) 所有对象都是Comparable接口的实例。对象在数组中的顺序是由compareTo方法决定的。 编写测试程序，从键盘输入5个字符串和5个整数，创建一个由5个字符串构成的数组、一个由5个整数构成的数组。找出数组中最大的字符串、整数并输出。

输入格式:
输入 Xi'an （输入5个字符串，每行一个） Beijing ShangHai GuangZhou ShenZhen 8 9 12 7 6 （输入5个整数，以空格分隔）

输出格式:
输出 Max string is Xi'an （输出最大的字符串） Max integer is 12 （输出最大的整数）

输入样例:
France
Japan
German
China
India
6 34 89 168 53
输出样例:
Max string is Japan
Max integer is 168
*/
import javax.naming.event.ObjectChangeListener;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.max;

public class FindMaxObject_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] StringArray = {new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next())};
        Integer[] IntegerArray = {new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt())};
        System.out.println("Max string is " + findMaxObj(StringArray)); //comparable类已实现 toString，可利用重载特性调用子类 String 的 toString
        System.out.println("Max integer is " + findMaxObj(IntegerArray));
        input.close();
    }

    public static comparable findMaxObj (Comparable[] a) { //利用多态
        comparable max = a[0];
        for (Comparable t : a) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}

