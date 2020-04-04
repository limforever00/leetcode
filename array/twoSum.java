package array;

class twoSum {
    public int[] twoSum(int[] c, int b) {
       int[] a = new int[2];
		
		for(int i=0; i<c.length; i++) {
			for(int j=c.length-1; j>=0; j--) {
				if(c[i]+c[j] == b && i != j) {
					a[0] = i;
					a[1] = j;
				}
			}
		}
		
		return a;
    }
    
    public static void main(String[] args) {
		System.out.println();
	}
}
