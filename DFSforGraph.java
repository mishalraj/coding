
import java.util.Iterator;
import java.util.LinkedList;

public class DFSforGraph {

	private static int V;
	
	private LinkedList<Integer> adj[];
	
	DFSforGraph(int v)
	{
		V=v;
		adj= new LinkedList[v];
		
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList<>();
		}
	}
	
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	void DFS()
	{
		boolean visited[]= new boolean[V];
		
		for(int i=0;i<V;i++)
		{
			if(!visited[i])
				DFSUtil(i,visited);
		}
	}
	
	
	void DFSUtil(int v, boolean []visited)
	{
		visited[v]=true;
		
		System.out.print(v+" ");
		
		Iterator<Integer> itr=  adj[v].listIterator();
		while(itr.hasNext())
		{
			int n= itr.next();
			
			if(!visited[n])
				DFSUtil(n,visited);
		}
	}
	
	public static void main(String[] args) {
		
		DFSforGraph g = new DFSforGraph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal"); 
  
        g.DFS(); 
	}

}
