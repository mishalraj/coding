/*
 * 
 * time complexity will be O(n);
number of comparisons: different for even and odd sized arrays
for odd : inside while loop  there will be 3 comparisons for each pair one for checking which element is bigger 
in between arr[i] and arr[i+1] and then two comparisons between arr[i] & arr[i+1] and min max 
total number of comparisons will be 3* (n-1)/2

for even : 1 comparison for base case and then 3*(n-2)/2 -> 1+ 3(n-2)/2; 

  *
  */

//min and max using least number of comparisons
public class MinAndMaxOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=  {100,11,67,0,45,1,700};
		int n = arr.length;
		pair res= new pair();
		
		res= findMinMax(arr,n);
		
		System.out.println("min- " +res.min+"  "+"max- "+ res.max);

	}
	
    static class pair
	{
		int min, max;
	}

	private static pair findMinMax(int[] arr, int n) {
		
			pair minmax = new pair();
			int i;
			
			if(n%2==0)
			{
				if(arr[0]>arr[1])
				{
					minmax.max= arr[0];
					minmax.min=arr[1];
				}
				if(arr[0]<arr[1])
				{
					minmax.max= arr[1];
					minmax.min=arr[0];
				}
				
				i=2;
			}
			//we are setting i=1 because we need to compare in pairs so we need even number of elements
			else
			{
				
					minmax.max= arr[0];
					minmax.min=arr[0];
					
				i=1;
			}
			
			while (i<n-1)
			{
				if(arr[i]>arr[i+1])
				{
					if(arr[i]>minmax.max)
					minmax.max= arr[1];
					
					if(arr[i+1]<minmax.min)
						minmax.min=arr[i+1];
				}
				
				
				if(arr[i]<arr[i+1])
				{
					if(arr[i+1]>minmax.max)
					minmax.max= arr[i+1];
					
					if(arr[i]<minmax.min)
						minmax.min=arr[i];
				}
				
				
				i+=2;
			}
			
			return minmax;
	}

}


