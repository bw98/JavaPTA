/*
7-1 给定一个字符串，判定是否是数字（10 分）
输出格式:
如果是数字就输出true , 不是数字就输出false.

输入样例:
3.145
输出样例:
true
*/
import java.util.Scanner;

public class IsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = new String(input.next());
        int flag = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '.') {
//                flag = 1;
//                break;
//            }
//        }

        if (s.indexOf(".") != -1) {
            flag = 1;
        }

        try {
            if (flag == 1)  {
                Double test = new Double(s);
            } else {
                Integer test = new Integer(s);
            }
        }catch (NumberFormatException e) {
            System.out.println(false);
            return;
        }
        System.out.println(true);
        input.close();
    }
}
