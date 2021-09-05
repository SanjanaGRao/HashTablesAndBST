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
	
	//Constructor to initialize
	public ImplementHashMap() 
	{
		this.myLinkedList = new MyLinkedList<>();
	}
	
	/*
	 * The method get is used to search the key in the linked list
	 * Takes the parameter key which is to be searched.
	 * @returns the value of the specified key
	 * Ternary operator is used, it returns null if the key isn't found, else, it returns the value of the key.
	 */
	public V get(K key)
	{
		MapMyNode<K, V> myMapNode=(MapMyNode<K,V>) this.myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}
	
	/*
	 * The method get is used to add the Key and Value to the linked list
	 * It takes the parameters Key and Value and appends it to the linked list using linked list's append function.
	 */
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
	
	//This method is used to display.
	@Override
	public String toString() {
		return "MyHashNodes {" + myLinkedList.printMyNodes() + "}";
	}	
}
