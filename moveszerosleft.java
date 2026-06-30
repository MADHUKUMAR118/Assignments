package arrayproblems;

import java.util.Arrays;

public class moveszerosleft {
	public static int[]movezero(int[]nums){
		//0,10,0,2,3,4---->		10,2,3,4,0,0,0
		int temp[]=new int[nums.length];
		int p=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				temp[p++]=nums[i];
			}
		}
		return temp;
	}
	public static void main(String args[]) {
		int arr[]= {0,10,0,2,3,4};
		System.out.println("adding the zeros at the  end : "+Arrays.toString(movezero(arr)));
	}

}
