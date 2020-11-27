package arrays;

public class MaximumOfAllSubArrays {
	
	public static int printMax(int[]arr,int n,int k)
	{
		int sumMax=0;
		int i=0;
		while(i!=k && i < n)
		{
			sumMax+= arr[i];
			i++;
		}
		int j=0;
		for(;i<n;i++)
		{
			int temp=sumMax+ arr[i]-arr[j];
			
			if(sumMax<temp)
			{
				sumMax=temp;
			}
			j++;
		}
		return sumMax;
	}

	public static void main(String[] args) {
		
		int arr[] = { 1,2,3,4,5,6,7,8,9}; 
        int k = 3; 
       System.out.println(printMax(arr, arr.length, k)); 

	}

}
