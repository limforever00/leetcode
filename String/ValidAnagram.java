package String;

import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

	public static void main(String[] args) {
		boolean a = isAnagram("abce","cbae");
		
		System.out.println(a);
	}

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		String[] sarr = s.split("");
		Arrays.sort(sarr);
		String[] tarr = t.split("");
		Arrays.sort(tarr);
		
		String newt = "";
		String news = "";
		for(int i=0; i<sarr.length; i++) {
			news += sarr[i];
			newt += tarr[i];
		}
		
		if(news.equals(newt)) {
			return true;
		}

		return false;
	}
}
