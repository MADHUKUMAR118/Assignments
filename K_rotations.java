package arrayproblems;

import java.util.Arrays;

public class K_rotations {
	//Take an array and k value rotate the array by k times. 
	// reverse the first k elements
	//reverse remaining elements
	//reverse entire array
	public static void reversekelements(int start,int k,int []nums) {
		while(start<k) {
			int temp=nums[k];
			nums[k]=nums[start];
			nums[start]=temp;
			start++;
			k--;
		}
		
	}
	public static void reverse_remaining(int k,int end,int []nums) {
		while(k<end) {
			int temp=nums[k];
			nums[k]=nums[end];
			nums[end]=temp;
			k++;
			end--;
		}
		
	}
	public static void reverse(int start ,int end, int[]nums) {
		while(start<end) {
			int temp=nums[end];
			nums[end]=nums[start];
			nums[start]=temp;
			start++;
			end--;
			
		}
		
	}
	public static int[]reverse(int []nums,int k){
		int start=0;
		int end= nums.length-1;
		reversekelements(start, k-1, nums);
		reverse_remaining(k, end, nums);
		
		reverse(start,end,nums);
		return nums;
	}
 public static void main(String args[]) {
	 int arr[]= {1,2,3,4,5,6,7,8,9};
	 int a=3;
	 System.out.println("the left rotated array 3 positions is: "+Arrays.toString(reverse(arr,a)));
 }
	
	
}
