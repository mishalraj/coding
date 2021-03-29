package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SmallestNumberYouCanMake {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inp= br.readLine();
		
		int arr[]= new int[inp.length()];
		
		for(int i=0;i<inp.length();i++)
		{
			arr[i]= inp.charAt(i)-48;
		}
		
			Arrays.parallelSort(arr);
			
			if(arr[0]!=0)
			{
				System.out.println(Arrays.toString(arr));
			}
			else
			{
				int count=0;
					for(int i=0;i<arr.length;i++)
					{
						if(arr[i]!=0)
						{
							break;
						}
						
						count++;
					}
					
				int a[]= new int[arr.length];
				a[0]= arr[count];
				for(int i=1;i<=count;i++)
				{
					a[i]=0;
				}
				for(int i=count+1;i<a.length;i++)
				{
					a[i]=arr[i];
				}
				
				
			System.out.println("Smallest num = "+ Arrays.toString(a));
			}
		
	}

}
