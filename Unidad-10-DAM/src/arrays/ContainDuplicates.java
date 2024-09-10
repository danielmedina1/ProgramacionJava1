package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
	public static void main(String[] args) {
		int[]nums = {1,2,3,1};
			if(containsDuplicate(nums)) {
					System.out.println("Hay Repetidos");
			} else {
				System.out.println("No hay repetidos");
			}
			
		
	}
	public static boolean containsDuplicate (int []nums) {
		int num=0;
		for (int i = 0; i < nums.length; i++) {
			num=nums[i];
			for (int j = i+1; j < nums.length; j++) {
				if(num==nums[j]) {
						return true;
				} 
			}
		}
		return false;
	
		
		
	}
	
	public static boolean containsDuplicate2 (int []nums) {
		int num=0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			num=nums[i];
			for (int j = i+1; j < nums.length; j++) {
				if(num==nums[j]) {
						return true;
				} 
			}
		}
		return false;
	
		
		
	}
	public static boolean containsDuplicate3 (int []nums) {
		Set<Integer> conjunto = new HashSet<>();
		for (Integer i: nums) {
			conjunto.add(i);
		}
		
		return !(conjunto.size()==nums.length);
	
		
		
	}

}
