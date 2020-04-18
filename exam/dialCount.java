package exam;

import java.util.ArrayList;
import java.util.List;

public class dialCount {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		
		System.out.println(a.length);
//		int a = solution("82195","64723");
//		
//		System.out.println(a);
	}
	
	public static int solution(String p, String s) {
		int answer = 13;
		
		String[] p1 = p.split("");
		String[] s1 = s.split("");
		List<Integer> res = new ArrayList<>();
		
		for(int i=0; i<p1.length; i++) {
			int num1 = Integer.parseInt(p1[i]);
			int num2 = Integer.parseInt(s1[i]);
			if(Math.abs(num1-num2) > 5) {
				res.add(10-Math.abs(num1-num2));
			}else {
				res.add(Math.abs(num1-num2));
			}
		}
		int result = 0;
		for(int n:res) {
			result += n;
		}
		
		return result;
	}
}
