
import java.util.ArrayList;
import java.util.Scanner;

public class Indicium {
	
	
	public static boolean isLatinSquare(int[][] s) {
		return isDistinctRow(s) && isDistinctColumn(s);
	}

	
	public static boolean isDistinctRow(int[][] s) {
		for (int i = 0; i < s.length; i++) {
			int[] counts = new int[s.length]; // Occurrence of each letter
			for (int j = 0; j < s[i].length; j++) {
				counts[s[i][j]]++;
				if (counts[s[i][j]] > 1)
					return false;
			}
		}
		return true;
	} 

	
	public static boolean isDistinctColumn(int[][] s) {
		for (int i = 0; i < s.length; i++) {
			int[] counts = new int[s[0].length]; // Occurrence of each letter
			for (int j = 0; j < s[i].length; j++) {
				counts[s[j][i]]++;
				if (counts[s[j][i]] > 1)
					return false;
			}
		}
		return true;
	}

	static ArrayList<ArrayList<Integer>> re= new ArrayList<>();
	
	static void printArr(int a[], int n) 
    { 
		ArrayList<Integer> temp = new ArrayList<>();
        for (int i=0; i<n; i++) 
        {
        	temp.add(a[i]);
        }
        
        re.add(temp);        
    } 
	
	static void heapPermutation(int a[], int size, int n) 
	    { 
	        if (size == 1) 
	            printArr(a,n); 
	  
	        for (int i=0; i<size; i++) 
	        { 
	            heapPermutation(a, size-1, n); 
	  
	            // if size is odd, swap first and last 
	            // element 
	            if (size % 2 == 1) 
	            { 
	                int temp = a[0]; 
	                a[0] = a[size-1]; 
	                a[size-1] = temp; 
	            } 
	            else
	            { 
	                int temp = a[i]; 
	                a[i] = a[size-1]; 
	                a[size-1] = temp; 
	            } 
	        } 
	    } 


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCases= sc.nextInt();
		
	for(int i=0;i<testCases;i++)
		{
		   ArrayList<int[][]> test= new ArrayList<>();
			int n= sc.nextInt();
			int trace= sc.nextInt();
			
			int arr[]= new int[n];
			
			for(int j=0;j<n;j++)
			{
				arr[j]= j+1;
			}
			
			heapPermutation(arr,n,n);
			
			
	        
		}
	}

}
