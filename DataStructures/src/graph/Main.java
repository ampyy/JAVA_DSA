package graph;

public class Main {

	public static void main(String[] args) {
		Graph1 g1 = new Graph1(4);
		g1.addEdge(0, 1);
		g1.addEdge(1, 2);
		g1.addEdge(2,3);
		g1.addEdge(3,0);
		
		System.out.println(g1);
		
		Graph2 g2 = new Graph2(5);
		g2.addEdge(0, 1);
		g2.addEdge(1, 2);
		g2.addEdge(2,3);
		g2.addEdge(3,0);
		g2.addEdge(2, 4);
		
		System.out.println(g2);
		g2.bfs(0);
		g2.dfs(0);
		System.out.println();
		g2.dfss();

	}

}
