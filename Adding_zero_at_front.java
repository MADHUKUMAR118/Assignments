package arrayproblems;

import java.util.Arrays;

public class Adding_zero_at_front {
	public static int [] addzeros(int[]nums) {
		int[] temp=new int[nums.length];
		//1,0,2,0,3,0---->0,0,0,1,2,3
		int count=nums.length-1;
		for(int i=nums.length-1;i>=0;i--) {
			
		if(nums[i]!=0) {
			nums[count]=nums[i];
			count--;
		         }
		}
		while(count>=0) {
			nums[count]=0;
			count--;
		}
		return nums;

}
	public static void main(String args[]) {
		int arr[]= {1,0,2,0,3,0};
		System.out.println("adding zeros at first : "+Arrays.toString(addzeros(arr)));
	}
}