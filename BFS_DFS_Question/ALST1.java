// Question All Path From Source to Destination

import java.util.*;


public class ALST1 {
	static class Edge{
		int s;
		int d;
		
		Edge(int s,int d){
			this.s = s;
			this.d = d;
		}
	}
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));
		
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));
		
		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));
		
		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));
		
		graph[6].add(new Edge(6, 5));
	}
	
	public static void dfs(ArrayList<Edge> graph[],boolean vis[],int curr,String path, int target) {
		if(curr == target) {
			System.out.println(path);
			return;
		}
		for(int i=0;i<graph[curr].size();i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.d]) {
				vis[curr] = true;
				dfs(graph,vis,e.d,path+e.d,target);
				vis[curr] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 7;
		
		ArrayList<Edge> graph[] = new ArrayList[v];
		
		createGraph(graph);
		int src = 1, dest = 5;
		
		dfs(graph,new boolean[v],src,"1",dest);
	}

}
