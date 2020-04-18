package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringtoInteger {

	public static void main(String[] args) {
//		double a = Math.pow(2, 2);
//		
//		System.out.println(a);
		
		String s = "++1";
		
		System.out.println(StringtoInteger(s));
	}
	public static int StringtoIntegerNew(String str) {
		
		return 0;
	}
	public static int StringtoInteger(String str) {
		
		String s = str.trim();
		
		if(s.length() ==0 || s.trim().equals("-") || s.trim().equals("+")){
            return 0;
        }	
		
		boolean minus = s.startsWith("-") ? true:false ;
		boolean plus = s.startsWith("+") ? true:false ;
		
		String[] remake = s.split(""); 
		
		if(minus == true) {
			s = "";
			for(int i=1; i < remake.length;i++) {
				s+=remake[i];
			}
		}else if(plus == true){
			s = "";
			for(int i=1; i < remake.length;i++) {
				s+=remake[i];
			}
		}
		
		Matcher m1 = Pattern.compile("[^0-9]+").matcher(s);
		
		String st = "";
		
		if(m1.find()) {
			st = m1.group(0);
		}
		
		boolean b = s.startsWith(st) ? true:false;	

		if(b == true && st.length()!=0) {
			return 0;
		}

		Matcher m = Pattern.compile("[0-9]+").matcher(s);
		
		if(m.find()) {
			s = m.group();
		}
		
		if(minus == true) {
			s  = "-"+s;
		}
		
		int num = 0;
		
		try {
			num = Integer.parseInt(s);
			return num;
		}catch(Exception e) {
			if(minus == true) {
				return Integer.MIN_VALUE;
			}
			return Integer.MAX_VALUE;
		}
	}	
}
