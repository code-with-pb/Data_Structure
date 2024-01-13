// Adjancency List == List of Lists

//        0   3
//         \ / \			this graph is undericted unweighted graph
//          2---1


//  vertext = 4  vertex is nothing but Node
//  Edge = 4  Edges in nothing but Direction 

// vertext-wise

// vertex = (source, destination)

// (0) 0 = {0,2}
// (1) 1 = {1,2},{1,3}
// (2) 2 = {2,0},{2,1},{2,3}
// (3) 3 = {3,1},{3,2}

//					v
// |---|---|---|---|
// |(0)|(1)|(2)|(3)|		 
// |---|---|---|---|


// Arraylist<Edge> graph[] we have to use this 


import java.util.*;

public class ALG1 {
	static class Edge{
		int src;
		int dest;
		int wt; // weighted graph add otherwise skip weight
		
		Edge(int s, int d, int w){
			this.src = s;
			this.dest = d;
			this.wt = w;
		}
	}
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0, 2, 2));
		
		graph[1].add(new Edge(1, 2, 10));
		graph[1].add(new Edge(1, 3, 0));
		
		graph[2].add(new Edge(2, 0, 2));
		graph[2].add(new Edge(2, 1, 10));
		graph[2].add(new Edge(2, 3, -1));
		
		graph[3].add(new Edge(3, 1, 0));
		graph[3].add(new Edge(3, 2, -1));
	}
	
	// 
	// 		0   3
	//    2 \-1/ \0		this graph is undericted weighted graph
	//    	  2---1
	//			10
	// 
	// ArrayList<Edge> graph[]
	//  Edge = (src,dest,weight)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 4;
		
		ArrayList<Edge> graph[] = new ArrayList[v];
		
		createGraph(graph);
		
		//print 2's neighbours
		
		for(int i=0;i<graph[2].size();i++) {
			Edge e = graph[2].get(i);
			System.out.println(e.dest+" "+e.wt);
		}
		
	}

}
