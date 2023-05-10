package leetcode.easy;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum1dArray {
	public static int[] runningSum(int[] nums) {
		for(int i=nums.length-1; i>0; i--) {
			int temp = 0;
			for(int j=0 ; j<=i; j++) {
				temp+=nums[j];
			}
			nums[i]=temp;
		}
        return nums;
    }
}
