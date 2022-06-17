package graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
	private int V;
	private int E;
	LinkedList<Integer>[] adj;

	public Graph2(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes]; 
		for (int i = 0; i < nodes; i++) {
		this.adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int u, int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
		E++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("V " + V + " E " + E + "\n");
		for (int v = 0; v < V; v++) {
			sb.append(v + " ");
			for (int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// 0 - > 1
	// | /\ 4
	// v | /\
	// 3 - > 2 /

	public void bfs(int s) {
		boolean[] visited = new boolean[V];
		Queue<Integer> que = new LinkedList<>();
		visited[s] = true;
		que.offer(s);

		while (!que.isEmpty()) {
			int u = que.poll();
			System.out.println(u + " ");
			for (int v : adj[u]) {
				if (!visited[v]) {
					visited[v] = true;
					que.offer(v);
				}
			}
		}				
	}
	
	public void dfs(int s) {		
		boolean visited[] = new boolean[V];
		Stack<Integer> stk = new Stack<Integer>();
			             
		stk.push(s);
		while(!stk.isEmpty()) {
			int u = stk.pop();
			if(!visited[u]) {
				visited[u] = true;
				System.out.println("Value : " + u);
				for(int v : adj[u]) {
					if(!visited[v]) {
						stk.push(v);
						
					}
				}
			}
		}
	}

	
	public void dfss() {
		boolean[] visited = new boolean[V];
		for(int v=0; v<V; v++) {
			if(!visited[v]) {
				dfsr(v, visited);
			}
		}
	}
	
	public void dfsr(int v, boolean[] visited) {
		visited[v] = true;
		System.out.println(v);
		for(int w : adj[v]) {
			if(!visited[w]) {
				dfsr(w, visited);
			}
		}
	}
	
}
















