package String;

public class CountAndSay {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		String s = a+b+"";
		System.out.println(s);
//		System.out.println(countAndSay(2));
	}

//	1.     1
//	2.     11
//	3.     21
//	4.     1211
//	5.     111221

	public static String countAndSay(int n) {		
		int cnt = n;
		
		if(n == 1) {
			return "1";
		}
		
		for(int i=2; i<n+1; i++) {
			
		}
		
		
		return "";
	}
}
