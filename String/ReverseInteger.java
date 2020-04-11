package String;

public class ReverseInteger {

	public static void main(String[] args) {
		int a = 600780;
		
		int b = reverse(a);

		System.out.println("revere["+a+"] = "+b );
	}

	public static int reverse(int x) {
		try {
			String s = x + "";

			String[] str = s.split("");
			String[] str_cp = new String[str.length];

			if (x < 0) {
				str_cp = new String[str.length - 1];
			}

			boolean minus = false;

			if (str[0].equals("-")) {
				for (int i = 0; i < str_cp.length; i++) {
					str_cp[i] = str[i + 1];
				}
				minus = true;
			} else {
				str_cp = str;
			}

			String tmp = "";

			int n = 0;

			while (n < str_cp.length / 2) {
				tmp = str_cp[n];
				str_cp[n] = str_cp[str_cp.length - 1 - n];
				str_cp[str_cp.length - 1 - n] = tmp;
				n++;
			}

			String res = "";

			for (int i = 0; i < str_cp.length; i++) {
				res+= str_cp[i];
			}

			if (minus == true) {
				res = "-" + res;
			}
			
			return Integer.parseInt(res);
			
		} catch (Exception e) {
			
			return 0;
		}
	}
}

class Solution {
    public int reverse(int x) {
        // overflow Integer.MAX_VALUE  return 0
        // long res;
        long res = 0;
        int m = Math.abs(x);
        while(m>0){
            res = res * 10 + m%10;
            if(res>Integer.MAX_VALUE)
                return 0;
            m /= 10;
        }
        if(x<0) // remeber the negative situation
            res *= -1;
        return (int)res;
    }
}
