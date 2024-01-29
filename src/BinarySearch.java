
public class BinarySearch {

	public static void main(String args[]) {
		int nums[] = { 1, 2, 3, 5, 7, 9, 10, 11, 13 };
		int target = 11;

		int result1 = binarySearch(nums, target);

		if (result1 != -1)
			System.out.println("Element found at index: " + result1);
		else
			System.out.println("Element not found");
	}

	private static int binarySearch(int[] nums, int target) {
		
		int left=0;
		int right=nums.length-1;
		
		while(left<=right) {
			int mid =(left+right)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
			
		}
		
		return -1;
	}

}
