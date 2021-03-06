package com.neww.hashTablesAndBST;
/*
 * The class BinarySerchTree extends comparable to compare and determine left or right node
 * @param root is for the root node to be created in a BST
 * @author Sanjana Rao
 * @since 7-09-2021
 */
public class BinarySearchTree<K extends Comparable<K>> 
{
	public BinaryNode<K> root;
	
	/*
	 * The method addElement adds an element to the BST
	 * It calls another method addElementRecursively to perform the insertion operation
	 * It takes in the user input
	 */
	public void addElement(K data)
	{
		this.root=this.addElementRecursively(root,data);
	}
	
	/*
	 * The method addElementRecursively makes use of recursion to insert a node
	 * It takes parameters root node and the user input from the method addElement
	 * It makes use of compareTo to compare the user input and then places it to the left or right subtree accordingly
	 * @returns the currentNode.
	 */
	public BinaryNode<K> addElementRecursively(BinaryNode<K> currentNode,K data)
	{
		if(currentNode==null)
			return new BinaryNode<>(data);
		int compareResult=((Comparable<K>) data).compareTo(currentNode.data);
		if(compareResult==0)
			return currentNode;
		if(compareResult<0)
		{
			currentNode.left=addElementRecursively(currentNode.left,data);
		}
		else
		{
			currentNode.right=addElementRecursively(currentNode.right,data);
		}
		return currentNode;
	}
	
	/*
	 * The method getSize is used to get the size of the BST
	 * It calls another method getSizeUsingRecursive which actually calculates the size
	 * @returns the size of BST - integer value
	 */
	public int getSize()
	{
		return this.getSizeUsingRecursive(root);
	}
	
	/*
	 * The method getSizeUsingRecursive takes in the parameter currentNode and uses ternary operator
	 * The conditional operator checks if it is null, if it is null, it returns 0 else it calculates and checks for left and right child
	 * @returns size of the BST - integer value
	 */
	private int getSizeUsingRecursive(BinaryNode<K> currentNode)
	{
		return (currentNode==null?0:1+this.getSizeUsingRecursive(currentNode.left)+this.getSizeUsingRecursive(currentNode.right));
	}
	
	/*
	 * The method searchElement is used to search for a particular element in the BST
	 * @param data is the element to be searched
	 * The method calls another method searchNodes which actually searches the data.
	 */
	public void searchElement(K data)
	{
		this.searchNodes(data,root);				
	}
	/*
	 * The method searchNodes implements the search operation
	 * UC 3 - Ability to search 63 in the Binary Tree
	 * It takes the parameters data element to be searched and the root position of last search.
	 * Again, compareTo is used. 
	 * Recursion is used to search the nodes in the left and right subtree and to traverse.
	 */
	private void searchNodes(K data,BinaryNode<K> root)
	{
		if(root == null)
		{
			System.out.println("The element you are searching is not found.");
			return;
		}
		int result=data.compareTo(root.data);
		if(result == 0)
			System.out.println("The element "+data+" is found in this BST.");
		else if(result < 0)
			searchNodes(data,root.left);
		else
			searchNodes(data, root.right);
	}
	
	/*
	 * The method getNodes is used to display
	 * This method calls another method printNodes which outputs the elements of a BST
	 */
	public void getNodes()
	{
		this.printNodes(root);
	}
	
	/*
	 * The method printNodes prints or displays the nodes.
	 * It takes the parameter root.
	 * The display is done using Postorder traversal method.
	 * First the left child is displayed, then right child and then the root.
	 */
	private void printNodes(BinaryNode<K> root) 
	{
		if(root==null)
			return;
		printNodes(root.left);
		printNodes(root.right);
		System.out.print(root.data+" ");		
	}
}
