package hackerrank_public;

import java.io.*;
import java.util.*;


public class Insertion_Sort_Advanced_Analysis {

    // Complete the insertionSort function below.
    static int insertionSort(int[] arr) {

    	//Tutorial: Binary Indexed Tree (Fenwick Tree)
    	//https://www.youtube.com/watch?v=v_wj_mOAlig&t=1s
    	
    	
    	//create binary tree
    	//first element from array is the root for our binary tree
    	Node root=new Node(arr[0]);
    	//the next elements from array became leaves and, thus, other nodes
    	//do not forget that first element from array is root for tree. So we start from second element 
    	for(int i=1; i<arr.length;i++) {
    		insert(root, arr[i]);
    	}
    	//print the binary tree in order
    	int y = printInOrder(root);
    	System.out.println("y este: "+y);
    	return 0;
    }
    
    //inner Node class
    static class Node{
    	int data;
    	Node left;
    	Node right;
    	//empty constructor
    	public Node(){
    		
    	}
    	//second constructor with value
    	public Node(int data) {
    		this.data=data;
    	}
    }   
    
    static void insert(Node node, int value) {
    	// use "<=" comparator because our array is not composed from unic numbers
    	if(value<=node.data) {
    		if(node.left!=null) {
    			insert(node.left, value);
    		}else {
    			node.left=new Node(value);
    		}
    	}else if(value>node.data) {
    		if(node.right!=null) {
    			insert(node.right, value);
    		}else {
    			node.right = new Node(value);
    		}
    	}
    }
    
    //print in order 
    static int x=0;
    public static int printInOrder(Node node) {   	
    	if(node!=null) {  
    		x++;
    		printInOrder(node.left);    		
    		System.out.println(node.data);   		
    		printInOrder(node.right);      		
    	} 	
    	return x;
    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\windows\\de.viitor\\java\\installed.softwares\\eclipse.workplace\\hackerrank\\OUTPUT.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = insertionSort(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

