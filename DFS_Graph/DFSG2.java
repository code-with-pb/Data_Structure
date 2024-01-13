import java.util.ArrayList;

public class DFSG2 {
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
	public static void dfs(ArrayList<Edge> a[], int curr, boolean vis[]) {
		System.out.print(curr+" ");
		vis[curr] = true;
		
		for(int i=0;i<a[curr].size();i++) {
			Edge e = a[curr].get(i);
			if(vis[curr] = false) {
				dfs(a, e.d, vis);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 7;
		
		ArrayList<Edge> a[] = new ArrayList[v];
		
		createGraph(a);
		
		boolean vis[] = new boolean[v];
		
		for(int i=0;i<v;i++) {
			if(vis[i] == true) {
				dfs(a, 0, vis);
			}
		}
	}

}
