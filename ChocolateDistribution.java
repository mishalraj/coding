import java.util.Arrays;

public class ChocolateDistribution {
	
	public static int findMinDiff(int[] arr, int m, int n)
	{
		if(m>n)
			return -1;
		
		if(m==0 || n==0)
			return 0;
		
		Arrays.parallelSort(arr);
		
		int minDiff = Integer.MAX_VALUE;
		for(int i=0;i+m-1<n;i++)
		{
			int diff= arr[i+m-1]-arr[i];
			
			if(diff<minDiff)
			{
				minDiff= diff;
			}
		}
		
		return minDiff;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {7, 3, 2, 4, 9, 12, 56};
		
		int m = 3;
		
		System.out.println(findMinDiff(arr,m,arr.length));
		
	}

}
