//Main Class
package dataStructures;

public class Main {
	public static void main(String[] args) {
		
	BFS bfSearch=new BFS(5);
	bfSearch.addNode(new Node('A'));
	bfSearch.addNode(new Node('B'));
	bfSearch.addNode(new Node('C'));
	bfSearch.addNode(new Node('D'));
	bfSearch.addNode(new Node('E'));
	
	bfSearch.addEdge(0, 1);
	bfSearch.addEdge(1, 2);
	bfSearch.addEdge(1, 4);
	bfSearch.addEdge(2, 3);
	bfSearch.addEdge(2, 4);
	bfSearch.addEdge(4, 0);
	bfSearch.addEdge(4, 2);
	
	bfSearch.print();
	bfSearch.BFsearch(1);
	}
}

//BFS class
package dataStructures;

import java.util.*;

class Node{
	char data;
	Node(char data){
		this.data=data;
	}
}
public class BFS{
	ArrayList<Node> nodes;
	int[][] matrix;
	
	BFS(int size){
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
	public void BFsearch(int src) {
		Queue<Integer> queue=new LinkedList<>();
		boolean[] visited=new boolean[matrix.length];
		queue.offer(src);
		visited[src]=true;
		while(queue.size()!=0) {
			src=queue.poll();
			System.out.println(nodes.get(src).data+" =Visited");
			for(int i=0;i<matrix[src].length;i++) {
				if(matrix[src][i]==1 && !visited[i]) {
					queue.offer(i);
					visited[i]=true;
				}
			}
		}
	}
}

