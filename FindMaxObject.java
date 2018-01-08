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
import java.util.Scanner;

public class FindMaxObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringArray = {new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next())};
        Integer[] integerArray = {new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt())};
        System.out.println("Max string is " + findMaxObj(stringArray, stringArray[0]));
        System.out.println("Max integer is " + findMaxObj(integerArray, integerArray[0]));
        input.close();
    }

       public static <T extends Comparable> T findMaxObj (T[] array,T max){ //继承 Comparable 接口，实现比较
           for(T t: array) {
            if(t.compareTo(max)>0){
                max = t;
            }
           }
        return max;
    }
}

