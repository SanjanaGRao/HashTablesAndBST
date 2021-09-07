package com.neww.hashTablesAndBST;
/*
 * This public interface INode is used to define a node.
 * @param K is of integer type.
 * @author Sanjana Rao
 * @since 5-09-2021
 */
public interface INode<K> 
{	
		K getKey();
		void setKey(K key);
		INode<K> getNext();
		void setNext(INode<K> next);
}
