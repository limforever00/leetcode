package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class implementStrStr {

	public static void main(String[] args) {
		int a = strStr("abccee","cc");
		
		System.out.println(a);
	}
	
	public static int strStr(String haystack, String needle) {        
//		int a = haystack.indexOf(needle);
		
//		if(haystack.split("needle").length ==1) {
//			return -1;
//		}
		Matcher m = Pattern.compile("("+needle+")").matcher(haystack);
		if(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			
			return m.start();
		}
		
		int lenA = haystack.length(); 
		int lenB = needle.length();
		int tmp = lenB;
		
		for(int i=0; i<lenA; i++) {
			int num = i;
			for(int j=0; j<lenB; j++) {
				while(tmp > 0) {
					
				tmp--;
				}
			}
		}
		
		
		return 0;
    }
}