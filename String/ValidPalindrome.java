package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {

	
	public static void main(String[] args) {
		String s = "race a car";
		s = "abcddcba";
		
		boolean a =isPalindrome(s);
		
		System.out.println(a);
	}

	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		
		s = s.toLowerCase();
		
		s = s.replaceAll("[^a-zA-Z0-9]+", "");
		
		String str[] = s.split("");
		
		String rev = "";
		
		for(int i = str.length-1; i>=0; i--) {
			rev += str[i];
		}
//		System.out.println("s = " + s);
//		System.out.println("rev = " + rev);
		if(rev.trim().equals(s)) {
			return true;
		}	
		return false;
		
//		return false;
	}
}
