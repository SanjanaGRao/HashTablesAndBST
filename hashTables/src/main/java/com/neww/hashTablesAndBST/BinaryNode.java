package com.neww.hashTablesAndBST;
/*
 * This public interface INode is used to define a node.
 * @param K is of integer type.
 * @param left and right are used to indicate children of a tree
 * @author Sanjana Rao
 * @since 5-09-2021
 */
public class BinaryNode<K extends Comparable<K>> 
{
		K key;
		BinaryNode<K> left;
		BinaryNode<K> right;
		public BinaryNode(K key)
		{
			this.key=key;
			this.left=this.right=null;
		}
}
