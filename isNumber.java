import java.util.Scanner;

public class isNumber {
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
