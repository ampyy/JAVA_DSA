package graph;
import java.util.LinkedList;
import java.util.Queue;

public class Graph1 {
	private int E;
	private int V;
	private int[][] adjMatrix;

	public Graph1(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}

	public void addEdge(int u, int v) {
		this.adjMatrix[u][v] = 1;
		this.adjMatrix[v][u] = 1;
		E++;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices " + E + " edges " + "\n");
		for (int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for (int w : adjMatrix[v]) {
				sb.append(w + " ");
			}

			sb.append("\n");
		}

		return sb.toString();
	}

	

}
