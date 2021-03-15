

import java.util.Scanner;

public class FindThePositiveMissing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findMissingNum(arr));

	}
	
	// Time complexity O(2n)-> O(n) and space complexity O(1)
    public int firstMissingPositive(int[] nums) {
        int INF = nums.length + 1;
        int N = nums.length;
        
        if(N == 0)
            return 1;
        
        // we don't care about negative numbers and zeros, thus, remove them
        for(int i=0; i<N; ++i)
            if(nums[i] <= 0)
                nums[i] = INF; 
        
        // for every found positive element set its value to negative to indicate that it was visited.
        // nums[val - 1] > 0 check if visited before to skip duplicates.
        for(int i=0; i<N; ++i){
            int val = Math.abs(nums[i]);
            if(val <= N && nums[val - 1] > 0){
                nums[val - 1] = -nums[val - 1];
            }
        }
        
        // first index to encounter with positive value will be the result
        for(int i=1; i<=N; ++i){
            if(nums[i - 1] > 0)
                return i;            
        }
        
        // all elements are exist in array from 1 to N inclusive.
        return N + 1;
    }

	private static int findMissingNum(int[] arr) {

		int val;
		int nextval;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0 || arr[i] > arr.length) {
				continue;
			}

			val = arr[i];

			while (arr[val - 1] == val) {
				nextval = arr[val - 1];
				arr[val - 1] = val;
				val = nextval;
				if (val <= 0 || val > arr.length) {
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1)
				return i + 1;
		}

		return arr.length + 1;
	}

}

// time complexity is O(n);
