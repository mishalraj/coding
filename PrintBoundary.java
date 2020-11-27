package arrays;

public class PrintBoundary {

	public static void main(String[] args) {
int maze[][] = {
				
//		{1,2,3,4},
//		{4,5,6,5},
//		{7,8,9,6}
				{ 1 , 2, 3, 4, 5 }, 
    			{ 16, 0, 0, 0, 6 },
    			{ 15, 0, 0, 0, 7 },
    			{ 14, 0, 0, 0, 8 },
    			{ 13,12,11,10, 9 } 				
		}; 


		int row= maze.length;
		int col=maze[0].length;
		
		int nr =0; int nc= 0;
		
		while(nr<row && nc< col)
		{
			for(int i=nc; i < col;i++)
			{
				System.out.print(maze[nr][i]+" ");
			}
			nr++;
			
			for(int i= nr;i<row; i++)
			{
				System.out.print(maze[i][col-1]+" ");
			}
			col--;
			
			if(nr< row)
			{
				for(int i =col-1 ;i>=nc;i--)
				{
					System.out.print(maze[row-1][i]+" ");
				}
				row--;
			}
			
			if(nc<col)
			{
				for(int i= row-1; i>=nr;i--)
				{
					System.out.print(maze[i][nc]+" ");
				}
				
				nc++;
			}
		}


//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				if(i==0 || i==2)
//				{
//					System.out.print(maze[i][j]+" ");
//				}
//				
//				else if(j>0 && j<3 )
//				{
//					System.out.print("  ");
//				}
//				else
//				{
//					System.out.print(maze[i][j]+" ");
//				}
//			}
//			
//			System.out.println();
//		
//		}
	}

}
