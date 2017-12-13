import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExactDivide {
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

