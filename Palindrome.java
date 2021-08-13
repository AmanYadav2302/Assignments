package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodeRepository check = new CodeRepository();
		 
		String c = "radar";
		int x = 5885;
		
		
// checking if integer is palindrome

		boolean b = check.input(x);
		if (b) {
			System.out.println("Its a palindrome");
		}
		else
			System.out.println("Not a palindrome");
	
// checking if String is palindrome
		
		boolean d = check.input(c);
		if (d) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
			int count = check.swap_Required(c);
			System.out.println("Number of swaps required to make sring pallindrome is" + count);
		}
}
}
