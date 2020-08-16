package hackerrank;

import java.util.Scanner;


public class Tree2{	
	Scanner reader=new Scanner(System.in);
	public static void main (String []args) {
		new Tree2().run();
	}
	
	static class Node{
		Node left, right;
		int value;
		public Node(int value) {
			this.value=value;
		}		
	}
	
	public void run() {
		System.out.println("Insert root value ");
		int nodeNr=reader.nextInt();
		Node root=new Node(nodeNr);
		System.out.println("Binary Tree Example");
		System.out.println("This is a binary tree with value of root: "+root.value);
		
		System.out.println("Insert the number of elements of trees ");
		int nrOfElem=reader.nextInt();
		for(int i=0;i<nrOfElem;i++) {
			System.out.println("Insert element ");
			insert(root, reader.nextInt());
		}
	}
	public void insert(Node node, int value) {
		if(value<node.value) {
			if(node.left!=null) {
				insert(node.left, value);
			}else{
				System.out.println("Inserted "+value+" to the left of "+node.value);
				node.left= new Node(value);
			}			
		}
		else if(value>node.value) {
			if(node.right!=null) {
				insert(node.right, value);
			}else {
				System.out.println("Inserted "+value+" to the right of "+node.value);
				node.right=new Node(value);
			}
		}
	}
	
}

