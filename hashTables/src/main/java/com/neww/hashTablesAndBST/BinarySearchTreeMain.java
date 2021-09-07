package com.neww.hashTablesAndBST;
/*
 * The main function is used to add the values to the BST and display it.
 * @param myBST is an object of class BinarySearchTree.
 * Methods addElement, getSize and getNodes are called using myBST.
 * @author Sanjana Rao
 * @since 7-09-2021
 */
public class BinarySearchTreeMain 
{
	public static void main(String[] args) 
	{
		BinarySearchTree<Integer> myBST = new BinarySearchTree<Integer>();
		myBST.addElement(56);
		myBST.addElement(30);
		myBST.addElement(70);
		myBST.addElement(22);
		myBST.addElement(40);
		myBST.addElement(11);
		myBST.addElement(3);
		myBST.addElement(16);
		myBST.addElement(60);
		myBST.addElement(95);
		myBST.addElement(65);
		myBST.addElement(63);
		myBST.addElement(67);
		System.out.println("The size of Binary Search Tree is: "+myBST.getSize());
		System.out.println("Elements of the BST - PostOrder Traversal: ");
		myBST.getNodes();
	}
}
