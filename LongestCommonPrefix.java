/*
7-5 求解给定字符串的前缀（10 分）
求解给定字符串的前缀。

输入格式:
输入数目不定的多对字符串，每行两个，以空格分开。 例如： filename filepath Tom Jack

输出格式:
返回两个字符串的最大前缀，例如： The common prefix is file No common prefix

输入样例:
filename filepath
Tom Jack
输出样例:
The common prefix is file
No common prefix
*/
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        s1 = new String(input.next());
        s2 = new String(input.next());
        while( (!s1.isEmpty()) && (!s2.isEmpty()) ) {
            printLongestPrefix(s1,s2);
            s1 = input.next();
            s2 = input.next();
        }
        input.close();
    }
    static void printLongestPrefix (String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("No common prefix");
            return;
        }
        if ((s1.isEmpty() && !s2.isEmpty()) || (!s1.isEmpty() && s2.isEmpty())) {
            System.out.println("No common prefix");
            return;
        }
        int index;
        String temp = new String("");
        for (index = 0; index < s1.length(); index++ ) {
            if ((index+1 > s2.length()) && (!temp.isEmpty())) {
                System.out.println("The common prefix is " + temp);
                break;
            }
            if (s1.charAt(index) == s2.charAt(index)) {
                temp += s1.charAt(index);
            }
            if ((s1.charAt(index) != s2.charAt(index)) && (temp.isEmpty())) {
                System.out.println("No common prefix");
                break;
            }
            if ((s1.charAt(index) != s2.charAt(index)) && (!temp.isEmpty())) {
                System.out.println("The common prefix is " + temp);
                break;
            }
        }

        return;
    }
}
