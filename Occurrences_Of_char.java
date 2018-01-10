/*
7-8 finds the occurrences of a specified character in the string（10 分）
Write a method that finds the number of occurrences of a specified character in the string using the following header:
public static int count(String str, char a) For example, count("Welcome", 'e') returns 2.
Write a test program that prompts the user to enter a string followed by a character and displays the number of occurrences of the character in the string.

INPUT:
Welcome e
OUTPUT:
The number of occurrences is 2.
*/
import java.util.*;
import java.math.*;
import java.text.*;
public class Occurrences_Of_char {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String s = new String(input.next());
		String temp = new String(input.next());
		char c = temp.charAt(0);
		int count = 0;
		char[] chararray = s.toCharArray();
		for(char it : chararray) {
			if (it == c) {
				++count;
			}
		}
		System.out.println("The number of occurrences is "+ count +".");
	}
}
