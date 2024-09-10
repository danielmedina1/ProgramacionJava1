package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int []nums = {};
	}
	 public int[] twoSum(int[] nums, int target){
	        Map<Integer, Integer> map = new HashMap<>();
	        int[] indices=new int[2];
	        boolean encontrado = false;
	        for (int i = 0; i < nums.length; i++) {
	        	for (int j = 0; j < nums.length; j++) {
					if(nums[i]+nums[j]==target) {
						indices[0]=i;
						indices[1]=j;
						encontrado = true;
					}
				}
				
			}
	        return indices;
	    }

}
