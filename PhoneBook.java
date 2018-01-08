/*
7-5 查找电话号码（10 分）
文件phonebook1.txt中有若干联系人的姓名和电话号码。 
高富帅 13312342222 
白富美 13412343333 
孙悟空 13512345555 
唐三藏 13612346666 
猪悟能 13712347777 
沙悟净 13812348888 

请你编写一个简单的通信录程序，当从键盘输入一个姓名时查找到对应的电话号码并输出。
如果没找到则显示Not found. 当输入的名字为noname时，表示结束。noname后面有一个名字，需要查找其对应的电话号码。

INPUT
白富美 13412343333
孙悟空 13512345555
唐三藏 13612346666
猪悟能 13712347777
沙悟净 13812348888
noname
白富美
/*白骨精*/

OUTPUT
13412343333
/*Not found.*/
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
