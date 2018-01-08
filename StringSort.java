import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray); //利用 Arrays 类的静态方法 sort 进行排序
        System.out.println(charArray);

    }
}
