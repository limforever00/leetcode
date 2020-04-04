package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class moveZero {
	
	public static void main(String[] args) {
		int[] a = {5,3,0,1,2,0};
		
		
		
		moveZeroes(a);
		
		for(int c:a) {
			System.out.println(c);
		}	
	}

	public static void moveZeroes(int[] nums) {
		 int other = 0;
	     int zero = 1;
	     while (zero < nums.length) {
	         while (nums[other] != 0 && other < nums.length) {
	        	 other++;
	         }

	         while ((zero < nums.length && nums[zero] == 0 && zero < nums.length) || zero < other) {
	        	 zero++;
	         }
	         
	         if (zero < nums.length) {
	             nums[other] = nums[zero];
	             nums[zero] = 0;
	             other++;
	         }
	     }	
	}

	public static void moveZeroesSort(int[] nums) {
		int len = nums.length;
		int cnt = 0;
		for(int n:nums) {
			if(n == 0) {
				cnt++;
			}
		}
		System.out.println("0의개수 = " + cnt);
		
//		Arrays.sort(nums);
		int tmp = 0;
		
		for(int i=0; i<len; i++) {
			if(i >len-cnt-1) {
				nums[i] = 0;
			}else {
				nums[i] = nums[i+cnt];
			}	
		}

	}
}
