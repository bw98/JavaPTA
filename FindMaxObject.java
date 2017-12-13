import java.util.Scanner;

public class FindMaxObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringArray = {new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next()), new String(input.next())};
        Integer[] integerArray = {new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt()), new Integer(input.nextInt())};
        System.out.println("Max string is " + max(stringArray, stringArray[0]));
        System.out.println("Max integer is " + max(integerArray, integerArray[0]));
        input.close();
    }

       public static <T extends Comparable> T max (T[] array,T max){
           for(T t: array) {
            if(t.compareTo(max)>0){
                max = t;
            }
           }
        return max;
    }
}

