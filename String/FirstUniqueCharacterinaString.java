package String;

import java.util.ArrayList;
import java.util.List;


public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		
		int a = FirstUniqueCharacterinaString("cac");
		
		System.out.println(a);
	}
	
	//return first unique Character
	public static int FirstUniqueCharacterinaString(String s) {
		if(s.length() == 0) {
			return -1;
		}
		List<Integer> a = new ArrayList<>();
		
		String[] str = s.split("");
		
		boolean rare = true;
		
		for(int i=0; i<str.length; i++) {
			a.add(i);
			rare = true;
			
			for(int j=str.length-1; j>i; j--) {
				if(str[i].equals(str[j])) {
					if(a.contains(i)) {
						a.remove(i);
					}
					if(a.contains(j)) {
						a.remove(j);
					}
					
					rare = false;
				}
			}			
		}
		for(int nn:a) {
			System.out.println(nn);
		}
		
		if(rare == true) {
			return -1;
		}
		
		return a.get(0);
		
	}
	
}
