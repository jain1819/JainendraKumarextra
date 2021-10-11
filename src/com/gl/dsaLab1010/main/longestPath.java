package com.gl.dsaLab1010.main;
import java.util.ArrayList;


		//Creating Binary tree node
		class Node {
			int Data;
			Node leftNode, rightNode;

			Node(int value) {
				Data = value;
				leftNode = null;
				rightNode = null;
			}
			
		}
		public class longestPath {

			
				
		/*We are using Arraylist as it has dynamic array with no memory size.
			Function to find and return the longest path*/

		

			public static ArrayList<Integer> LongestPath(Node root) {

				// if root is null no binary tree, return empty
				if (root == null) {
					ArrayList<Integer> path = new ArrayList<>();
					return path;
				}
				// Recursive call on right node of root
				ArrayList<Integer> rightNodePath = LongestPath(root.rightNode);

				// Recursive call on left node of root
				ArrayList<Integer> leftNodePath = LongestPath(root.leftNode);

				// Comparing the size of the two Arraylist
				// and inserting current node accordingly

				if (rightNodePath.size() < leftNodePath.size()) {
					leftNodePath.add(root.Data);
				} else {
					rightNodePath.add(root.Data);
				}

				// Returning the appropriate Arraylist
				return (leftNodePath.size() > rightNodePath.size() ? leftNodePath : rightNodePath);
			}

			// Driver class
			public static void main(String[] args) {

			//storing data in node
				Node root = new Node(100);

				Node n1 = new Node(20);
				Node n2 = new Node(130);
				Node n3 = new Node(10);
				Node n4 = new Node(50);
				Node n5 = new Node(110);
				Node n6 = new Node(140);
				Node n7 = new Node(5);
				// making tree 
				n3.leftNode = n7;

				n1.leftNode = n3;
				n1.rightNode = n4;

				n2.leftNode = n5;
				n2.rightNode = n6;

				root.leftNode = n1;
				root.rightNode = n2;

				// printing the longest path from root
				ArrayList<Integer> longestPath = LongestPath(root);
				int l = longestPath.size();

				System.out.println("Longest path is ");

				System.out.print(longestPath.get(l - 1));
				for (int i = l - 2; i >= 0; i--) {
					System.out.print(" -> " + longestPath.get(i));
				}
			}
		
	}


