/*
INPUT
白富美 13412343333
孙悟空 13512345555
唐三藏 13612346666
猪悟能 13712347777
沙悟净 13812348888
noname
白富美
白骨精

OUTPUT
13412343333
Not found.
 */

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<String, String>();
        String temp = null;
        while (input.hasNext()) {
            temp = input.next();
            if (!temp.equals("noname")) {
                hm.put(temp, input.next());
            }
            else{
                break;
            }
        }
        while (input.hasNext()) {
            temp = input.next();
            if (hm.containsKey(temp)) {
                System.out.println(hm.get(temp));
            }
            else {
                System.out.println("Not found.");
            }
        }
    }
}
