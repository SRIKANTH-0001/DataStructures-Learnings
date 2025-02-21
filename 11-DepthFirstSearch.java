//Main class
package dataStructures;

public class Main {
	public static void main(String[] args) {
		
	DFS dfSearch=new DFS(5);
	dfSearch.addNode(new Node('A'));
	dfSearch.addNode(new Node('B'));
	dfSearch.addNode(new Node('C'));
	dfSearch.addNode(new Node('D'));
	dfSearch.addNode(new Node('E'));
	
	dfSearch.addEdge(0, 1);
	dfSearch.addEdge(1, 2);
	dfSearch.addEdge(1, 4);
	dfSearch.addEdge(2, 3);
	dfSearch.addEdge(2, 4);
	dfSearch.addEdge(4, 0);
	dfSearch.addEdge(4, 2);
	
	dfSearch.print();
	dfSearch.dfSearch(1);
	}
}

//DFS class
package dataStructures;

import java.util.*;

class Node{
	char data;
	Node(char data){
		this.data=data;
	}
}
public class DFS{
	ArrayList<Node> nodes;
	int[][] matrix;
	
	DFS(int size){
		nodes=new ArrayList<>();
		matrix=new int[size][size];
	}
	public void addNode(Node node) {
		nodes.add(node);
	}
	public void addEdge(int src,int dest) {
		matrix[src][dest]=1;
	}
	public boolean checkEdge(int src,int dest) {
		if(matrix[src][dest]==1) {
			return true;
		}else {
			return false;
		}
	}
	public void print() {
		System.out.println(" ");
		for(Node node:nodes) {
			System.out.println(node.data+"");
		}
		System.out.println();
		
		for(int i=0;i<matrix.length;i++) {
			System.out.println(nodes.get(i).data+"");
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j]+"");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void dfSearch(int src) {
		boolean[] visited=new boolean[matrix.length];
		dfsHelper(src,visited);
				
			
		
	}
	private void dfsHelper(int src, boolean[] visited) {
		if(visited[src]) {
			return;
		}else {
			visited[src]=true;
			System.out.println(nodes.get(src).data+" =Visited");
		}
		
		for(int i=0;i<matrix.length;i++) {
			if(matrix[src][i] == 1) {
				dfsHelper(i,visited)
			}
		}
	}
}

