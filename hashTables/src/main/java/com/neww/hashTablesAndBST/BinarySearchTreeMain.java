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
		System.out.println("The size of Binary Search Tree is: "+myBST.getSize());
		System.out.println("Elements of the BST - PostOrder Traversal: ");
		myBST.getNodes();
	}
}
