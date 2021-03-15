
//public class RatInMaze 
//{ 
//    final int N = 5; 
//  
//    /* A utility function to print solution matrix 
//       sol[N][N] */
//    void printSolution(int sol[][]) 
//    { 
//        for (int i = 0; i < N; i++) 
//        { 
//            for (int j = 0; j < N; j++) 
//                System.out.print(" " + sol[i][j] + 
//                                 " "); 
//            System.out.println(); 
//        } 
//    } 
//  
//    /* A utility function to check if x,y is valid 
//        index for N*N maze */
//    boolean isSafe(int maze[][], int x, int y) 
//    { 
//        // if (x,y outside maze) return false 
//        return (x >= 0 && x < N && y >= 0 && 
//                y < N && maze[x][y] == 1); 
//    } 
//  
//    /* This function solves the Maze problem using 
//       Backtracking. It mainly uses solveMazeUtil() 
//       to solve the problem. It returns false if no 
//       path is possible, otherwise return true and 
//       prints the path in the form of 1s. Please note 
//       that there may be more than one solutions, this 
//       function prints one of the feasible solutions.*/
//    boolean solveMaze(int maze[][]) 
//    { 
//        int sol[][] = {
//        		{0, 0, 0, 0,0}, 
//        		{0, 0, 0, 0,0}, 
//        		{0, 0, 0, 0,0}, 
//        		{0, 0, 0, 0,0},
//        		{0, 0, 0, 0,0} 
//
//        }; 
//  
//        if (solveMazeUtil(maze, 0, 0, sol) == false) 
//        { 
//            System.out.print("Solution doesn't exist"); 
//            return false; 
//        } 
//  
//        printSolution(sol); 
//        return true; 
//    } 
//  
//    /* A recursive utility function to solve Maze 
//       problem */
//    boolean solveMazeUtil(int maze[][], int x, int y, 
//                          int sol[][]) 
//    { 
//        // if (x,y is goal) return true 
//        if (x == N - 1 && y == N - 1) 
//        { 
//            sol[x][y] = 1; 
//            return true; 
//        } 
//  
//        // Check if maze[x][y] is valid 
//        if (isSafe(maze, x, y) == true) 
//        { 
//            // mark x,y as part of solution path 
//            sol[x][y] = 1; 
//  
//            /* Move forward in x direction */
//            if (solveMazeUtil(maze, x + 1, y, sol)) 
//                return true; 
//  
//            /* If moving in x direction doesn't give 
//               solution then  Move down in y direction */
//            if (solveMazeUtil(maze, x, y + 1, sol)) 
//                return true; 
//            
//            if(solveMazeUtil(maze,x+1,y+1,sol))
//            	return true;
//            
//            if(solveMazeUtil(maze,x,y-1,sol))
//            	return true;
//  
//            /* If none of the above movements works then 
//               BACKTRACK: unmark x,y as part of solution 
//               path */
//            sol[x][y] = 0; 
//            return false; 
//        } 
//  
//        return false; 
//    } 
//  
//    public static void main(String args[]) 
//    { 
//        RatInMaze rat = new RatInMaze(); 
//        int maze[][] = {
//        		{ 1, 1, 1, 1, 1 }, 
//    			{ 0, 0, 0, 0, 1 },
//    			{ 1, 0, 1, 1, 1 }, 
//    			{ 1, 0, 1, 0, 0 },
//    			{ 1, 0, 1, 1, 1 } 
//        }; 
//        rat.solveMaze(maze); 
//    } 
//}


//
//class RatInMaze {
//	private static final int SIZE = 5;
//
//	// the maze problem
//	private static int[][] maze = { 
//			
//			{ 1, 1, 1, 1, 1 }, 
//			{ 1, 0, 1, 0, 1 },
//			{ 1, 0, 1, 0, 1 }, 
//			{ 1, 0, 1, 0, 1 },
//			{ 1, 1, 1, 0, 1 } 
//	};
//
//	
//	
//	// matrix to store the solution
//	private static int[][] solution = new int[SIZE][SIZE];
//
//	// function to print the solution matrix
//	private static void printSolution() {
//		for (int i = 0; i < SIZE; i++) {
//			for (int j = 0; j < SIZE; j++) {
//				System.out.print(solution[i][j] + "\t");
//			}
//			System.out.print("\n\n");
//		}
//	}
//
//	// function to solve the maze
//	// using backtracking
//	private static boolean solveMaze(int r, int c) {
//		// if destination is reached, maze is solved
//		// destination is the last cell(maze[SIZE-1][SIZE-1])
//		if ((r == SIZE - 1) && (c == SIZE - 1)) {
//			solution[r][c] = 1;
//			return true;
//		}
//		// checking if we can visit in this cell or not
//		// the indices of the cell must be in (0,SIZE-1)
//		// and solution[r][c] == 0 is making sure that the cell is not already visited
//		// maze[r][c] == 0 is making sure that the cell is not blocked
//		if (r >= 0 && c >= 0 && r < SIZE && c < SIZE && solution[r][c] == 0 && maze[r][c] == 0) {
//			// if safe to visit then visit the cell
//			solution[r][c] = 1;
//			// going down
//			if (solveMaze(r + 1, c))
//				return true;
//			// going right
//			if (solveMaze(r, c + 1))
//				return true;
//			// going up
//			if (solveMaze(r - 1, c))
//				return true;
//			// going left
//			if (solveMaze(r, c - 1))
//				return true;
//			// backtracking
//			solution[r][c] = 0;
//			return false;
//		}
//		return false;
//
//	}
//
//	public static void main(String[] args) {
//		if (solveMaze(0, 0))
//			printSolution();
//		else
//			System.out.println("No solution\n");
//	}
//}
//
//
//
//

//public class RatInMaze {
//
//	public int[][] solution;
//
//	//initialize the solution matrix in constructor.
//	public RatInMaze(int N) {
//		solution = new int[N][N];
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				solution[i][j] = 0;
//			}
//		}
//	}
//
//	public void solveMaze(int[][] maze, int N) {
//		if (findPath(maze, 0, 0, N, "diagonal")) {
//			print(solution, N);
//		}else{
//			System.out.println("NO PATH FOUND");
//		}
//		
//	}
//
//	public boolean findPath(int[][] maze, int x, int y, int N, String direction) {
//		// check if maze[x][y] is feasible to move
//		if(x==N-1 && y==N-1){//we have reached
//			solution[x][y] = 1;
//			return true;
//		}
//		if (isSafeToGo(maze, x, y, N)) {
//			// move to maze[x][y]
//			solution[x][y] = 1;			
//			// now rat has four options, either go right OR go down or left or go up
//			if(direction!="up" && findPath(maze, x+1, y, N, "down")){ //go down
//				return true;
//			}
//			if(direction!="left" && findPath(maze, x, y+1, N,"right")){ //go right
//				return true;
//			}
//			if(direction!="down" && findPath(maze, x+1, y+1, N, "diagonal")){ //go diagonal
//				return true;
//			}
//			if(direction!="right" &&  findPath(maze, x, y-1, N, "left")){ //go left
//				return true;
//			}
//			//if none of the options work out BACKTRACK undo the move
//			solution[x][y] = 0;
//			return false;
//		}
//		return false;
//	}
//
//	// this function will check if mouse can move to this cell
//	public boolean isSafeToGo(int[][] maze, int x, int y, int N) {
//		// check if x and y are in limits and cell is not blocked
//		if (x >= 0 && y >= 0 && x < N  && y < N && maze[x][y] != 0) {
//			return true;
//		}
//		return false;
//	}
//	public void print(int [][] solution, int N){
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(" " + solution[i][j]);
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String[] args) {
//		int N = 5;
//		int[][] maze = { 
//				{ 1, 0, 0, 0, 1 }, 
//    			{ 0, 1, 0, 0, 1 },
//    			{ 0, 0, 1, 0, 1 }, 
//    			{ 1, 0, 0, 1, 0 },
//    			{ 1, 0, 1, 0, 1 } 
//				
//		};
//		RatInMaze r = new RatInMaze(N);
//		r.solveMaze(maze, N);
//	}
//
//}




//public class RatInMaze { 
//	final int N = 5; 
//	void printSolution(int sol[][]) 
//	{ 
//		for (int i = 0; i < N; i++) { 
//			for (int j = 0; j < N; j++) 
//				System.out.print(" " + sol[i][j] + " "); 
//			System.out.println(); 
//		} 
//	} 
//	boolean isSafe(int maze[][], int x, int y) 
//	{ 
//		return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1); 
//	} 
//	
//	boolean solveMaze(int maze[][]) 
//	{ 
//		int sol[][] = { {0, 0, 0, 0,0}, 
//						{0, 0, 0, 0,0}, 
//						{0, 0, 0, 0,0}, 
//						{0, 0, 0, 0,0},
//						{0, 0, 0, 0,0}  }; 
//
//		if (solveMazeUtil(maze, 0, 0, sol) == false) { 
//			System.out.print("Solution doesn't exist"); 
//			return false; 
//		} 
//
//		printSolution(sol); 
//		return true; 
//	} 
//
//	boolean solveMazeUtil(int maze[][], int x, int y, 
//						int sol[][]) 
//	{ 
//		
//		if (x == N - 1 && y == N - 1) { 
//			sol[x][y] = 1; 
//			return true; 
//		} 
//
//		if (isSafe(maze, x, y) == true) { 
//			sol[x][y] = 1; 
//
//			if (solveMazeUtil(maze, x + 1, y, sol)) 
//				return true; 
//
//		
//			if (solveMazeUtil(maze, x, y + 1, sol)) 
//				return true; 
//          
//          if( y!=0)
//          {
//          if (solveMazeUtil(maze, x + 1, y-1, sol)) 
//				return true; 
//          }
//          
//          
//
//          if (solveMazeUtil(maze, x + 1, y+1, sol)) 
//				return true; 
//         
//          
//          
//          if(y!=0)
//          if (solveMazeUtil(maze, x , y-1, sol)) 
//				return true; 
//
//          
//			sol[x][y] = 0; 
//			return false; 
//		} 
//
//		return false; 
//	} 
//
//	public static void main(String args[]) 
//	{ 
//		RatInMaze rat = new RatInMaze(); 
//		int maze[][] = {
//				
//				{ 1, 0, 0, 0, 0 }, 
//    			{ 1, 0, 1, 1, 1 },
//    			{ 1, 0, 1, 0, 1 },
//    			{ 1, 0, 1, 0, 1 },
//    			{ 1, 1, 1, 1, 1 } 
//						
//		}; 
//		rat.solveMaze(maze); 
//	} 
//} 

class RatInMaze  
{ 
  
    // Maze size  
    static int N = 5; 
  
    /* A utility function to print solution matrix  
    sol[N][N] */
    static void printSolution(int sol[][])  
    { 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++)  
            { 
                System.out.printf(" %d ", sol[i][j]); 
            } 
            System.out.printf("\n"); 
        } 
    } 
  
    /* A utility function to check if x, y is valid  
    index for N*N maze */
    static boolean isSafe(int maze[][], int x, int y)  
    { 
          
        // if (x, y outside maze) return false  
        if (x >= 0 && x < N && y >= 0 &&  
             y < N && maze[x][y] != 0) 
        { 
            return true; 
        } 
  
        return false; 
    } 
  
    /* This function solves the Maze problem using  
    Backtracking. It mainly uses solveMazeUtil() to  
    solve the problem. It returns false if no path  
    is possible, otherwise return true and prints  
    the path in the form of 1s. Please note that  
    there may be more than one solutions,  
    this function prints one of the feasible solutions.*/
    
    static boolean solveMaze(int maze[][])  
    { 
        int sol[][] = { {0, 0, 0, 0,0}, 
        				{0, 0, 0, 0,0}, 
        				{0, 0, 0, 0,0}, 
        				{0, 0, 0, 0,0},
						{0, 0, 0, 0,0} }; 
  
        if (solveMazeUtil(maze, 0, 0, sol) == false)  
        { 
            System.out.printf("Solution doesn't exist"); 
            return false; 
        } 
  
        printSolution(sol); 
        return true; 
    } 
  
    /* A recursive utility function to solve Maze problem */
    static boolean solveMazeUtil(int maze[][], int x,  
                                 int y, int sol[][])  
    { 
        // if (x, y is goal) return true  
        if (x == N - 1 && y == N - 1) 
        { 
            sol[x][y] = 1; 
            return true; 
        } 
  
        // Check if maze[x][y] is valid  
        if (isSafe(maze, x, y) == true)  
        { 
  
            // mark x, y as part of solution path  
            sol[x][y] = 1; 
  
            /* Move forward in x direction */
            for (int i = 1; i <= maze[x][y] && i < N; i++)  
            { 
  
                /* Move forward in x direction */
                if (solveMazeUtil(maze, x + i, y, sol) == true)  
                { 
                    return true; 
                } 
  
                /* If moving in x direction doesn't give  
                solution then Move down in y direction */
                if (solveMazeUtil(maze, x, y + i, sol) == true)  
                { 
                    return true; 
                } 
                
            } 
  
            /* If none of the above movements work then  
            BACKTRACK: unmark x, y as part of solution  
            path */
            sol[x][y] = 0; 
            return false; 
        } 
  
        return false; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int maze[][] = {{ 1, 0, 0, 0, 0 }, 
        				{ 1, 1, 1, 0, 1 },
        				{ 0, 0, 1, 0, 1 },
        				{ 1, 0, 1, 0, 1 },
        				{ 1, 1, 1, 1, 1 }}; 
  
        solveMaze(maze); 
    } 
} 



