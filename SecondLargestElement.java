package arrayproblems;

public class SecondLargestElement {
	public static int secondelement(int []nums) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				secondMax=max;
				max=nums[i];
			}
			else if (nums[i] > secondMax && nums[i] != max) {
	              secondMax = nums[i];
	          }
		}
		  
		
		
		return secondMax;
	}
	public static void main(String args[]) {
		int []arr= {2,7,9,10,6,5};
		System.out.println("second largest number : "+secondelement(arr));
	}

}
