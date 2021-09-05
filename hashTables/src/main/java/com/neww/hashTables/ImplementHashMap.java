package com.neww.hashTables;
/*
 * to perform the operations of hash map
 * @param <K> is the key of the hash map
 * @param <V> is the value of the hash map
 * @author Sanjana Rao
 * @since 5-09-2021
 */
public class ImplementHashMap<K,V>
{
	MyLinkedList<K> myLinkedList;
	
	public ImplementHashMap() 
	{
		this.myLinkedList = new MyLinkedList<>();
	}
	
	public V get(K key)
	{
		MapMyNode<K, V> myMapNode=(MapMyNode<K,V>) this.myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}
	
	public void add(K key,V value)
	{
		MapMyNode<K,V> myMapNode=(MapMyNode<K,V>) this.myLinkedList.search(key);
		if(myMapNode==null)
		{
			myMapNode=new MapMyNode<>(key,value);
			this.myLinkedList.append(myMapNode);
		}
		else
		{
			myMapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "MyHashNodes {" + myLinkedList.printMyNodes() + "}";
	}	
}
