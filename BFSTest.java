import java.util.*;

public class BFSTest {
	private int V;
	private LinkedList<Integer> adj[];
	
	BFSTest(int v)
	{
		this.V= v;
		adj= new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList();
		}
	}
	
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	void BFS(int start)
	{
		boolean []visited= new boolean[V];
		
		Queue<Integer>q = new LinkedList<>();
		
		q.add(start);
		visited[start]=true;
		
		while(q.size()!=0)
		{
			start=q.poll();
			System.out.print(start+" ");
			
			for(Integer i: adj[start])
			{
				int n= i.intValue();
				if(!visited[n])
				{
					visited[n]=true;
					q.add(n);
				}
			}
		}
	}

	public static void main(String[] args) {

		BFSTest g = new BFSTest(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2); 
	}

}
