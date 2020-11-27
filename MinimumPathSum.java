package arrays;

public class MinimumPathSum {

	public static void main(String[] args) {
		int arr[][]= {
				{1,3,1},
				{1,5,1},
				  {4,2,1}
		};
		
		MinimumPathSum obj= new MinimumPathSum();
		
		System.out.println(obj.minPathFinder(arr));
	}

	private int minPathFinder(int[][] arr) {
		
		if(arr.length==0)
			return 0;

		int path[][]=new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				path[i][j]+= arr[i][j];
			
				if(i>0 && j>0)
					path[i][j]+= Math.min(path[i-1][j], path[i][j-1]);
				
				else if(i>0)
					path[i][j]+=path[i-1][j];
				
				else if(j>0)
					path[i][j]+=path[i][j-1];
			}
		}
		
		return path[path.length-1][path[0].length-1];
	}

}
