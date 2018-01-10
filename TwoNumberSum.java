/*
7-9 数字格式异常（10 分）
(NumberFormatException数字格式异常)编写一个程序，提示用户读取两个整数，然后显示他们的和。程序应该在输入不正确时提示用户再次输入数字。

输入格式:
i 9 （第1次输入）
l 8 （第2次输入） 
5 6 （第3次输入）

输出格式:
Incorrect input and re-enter two integers: （第1次输出提示） 
Incorrect input and re-enter two integers: （第2次输出提示）
Sum is 11 （输出结果）

INPUT
i 9
l 8
5 6
OUTPUT

Incorrect input and re-enter two integers:
Incorrect input and re-enter two integers:
Sum is 11
*/
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
                input.nextline(); //吸收缓冲区字符
            }
        }
        System.out.println("Input Successfully and sum is " + (a+b));
        input.close();
    }
}
