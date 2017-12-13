import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
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
