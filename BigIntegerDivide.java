/*
7-7 大数整除（10 分）
请编写程序，从键盘输入一个整数n，找出大于long.MAX_VALUE且能被n整除的前3个数字。

输入格式:
输入一个作为除数的整数n，例如： 17

输出格式:
输出大于long.MAX_VALUE且能被n整除的前3个数字，例如下列三个数能被17整除且大于long.MAX_VALUE： 9223372036854775816 9223372036854775833 9223372036854775850

输入样例:
103
输出样例:
9223372036854775832
9223372036854775935
9223372036854776038
*/

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDivide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
        BigInteger max;
        max = new BigInteger("9223372036854775807");
        int count = 0;
        while (count < 3) {
            if(max.remainder(n) == BigInteger.ZERO) {
                System.out.println(max);
                count++;
            }
            max = max.add(BigInteger.ONE);
        }
        input.close();
    }
}

