
public class Kadane {

	public static void main(String[] args) {

		int arr[]= {1,2,3,-2,5};
		
		System.out.println(kadaneUtil(arr,arr.length));
	}

	private static int kadaneUtil(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int res=arr[0];
		int currentSum=arr[0];
	
		for(int i=1;i<n;i++)
		{
			currentSum = Math.max(arr[i], currentSum+arr[i]);
			res = Math.max(res, currentSum);
			
		}	
		
		return res;
		
	}

}
