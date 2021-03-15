public class SeggregatingPositiveAndNegative {

	public static void main(String[] args) {
		
		int arr[]= {-2,4,6,8,-1,-6};
		
		seggregateHelper(arr,0,arr.length-1);
		
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}

	private static void seggregateHelper(int[] arr, int low, int high) {
		
		while(low<=high)
		{
			if(arr[low]<0 && arr[high]<0)
			{
				low++;
			}
			
			else if (arr[low]>0 && arr[high]<0)
			{
				int temp = arr[low];
				arr[low]= arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
			
			else if(arr[low]>0 && arr[high]>0)
			{
				high--;
			}
			
			else
			{
				high--;
				low++;
			}
		}
		
	}

}
