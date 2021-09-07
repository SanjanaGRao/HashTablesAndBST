package com.neww.hashTablesAndBST;
/*
 * This public class BinaryNode is used to define a node for BST.
 * @param K is of integer type.
 * @param left and right are used to indicate children of a tree
 * Initially, they are set to null.
 * @author Sanjana Rao
 * @since 7-09-2021
 */
public class BinaryNode<K extends Comparable<K>> 
{
		K data;
		BinaryNode<K> left;
		BinaryNode<K> right;
		public BinaryNode(K data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
}
