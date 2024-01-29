
public class LinearSearch {

	public static void main(String args[]) {
		int nums[]= {1,2,3,5,7,9,10,11,13};
		int target= 11;

		int result1 = linearSearch(nums, target);
		
		if(result1 != -1)
			System.out.println("Element found at index: "+ result1);
		else
			System.out.println("Element not found");
	}

	private static int linearSearch(int[] nums, int target) {
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
}


