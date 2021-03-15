
public class QuickSort {

	public static void main(String[] args) {

	int arr[]= {1,5,70,2,4};
		
		int n= arr.length;
		
		print(arr);
		
		sort(arr,0,n-1);
		System.out.println();
		print(arr);
	}
	
	
	static void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pivot= partition(arr,low,high);
			
			sort(arr,low,pivot-1);
			sort(arr,pivot+1,high);
		}
	}
	
	static int partition(int arr[],int low,int high)
	{
		int pi= arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pi)
			{
				i++;
				swap(arr,i,j);
			}	
		}
		
		swap(arr,i+1,high);
		
		return i+1;
	}
	
	static void swap(int arr[],int i,int j)
	{
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
	
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
