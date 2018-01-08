/*
7-3 求阶乘Factorial（10 分）
编程从键盘输入一个整数，计算出阶乘并输出。

输入格式:
输入 39

输出格式:
输出：20397882081197443358640281739902897356800000000

输入样例:
58
输出样例:
2350561331282878571829474910515074683828862318181142924420699914240000000000000
*/
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static BigInteger Factorial(BigInteger x)
    {
        if(x.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return x.multiply(Factorial (x.subtract(BigInteger.valueOf(1))));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        BigInteger factorialVal = Factorial(a);
        System.out.println(factorialVal);
    }
}
