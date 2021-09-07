package com.neww.hashTablesAndBST;
/*
 *  The class MapMyNode implements the interface INode which will set the getter and setter values.
 *  Has a K,V i.e., key and value pair.
 *  @author Sanjana Rao
 *  @since 5-09-2021
 */
public class MapMyNode<K,V> implements INode<K> 
{
	K key;
	V value;
	MapMyNode<K,V> next;
	public MapMyNode(K key,V value)
	{
		this.key=key;
		this.value=value;
		next=null;
	}
	@Override
	public K getKey()
	{
		return key;
	}
	@Override
	public void setKey(K key)
	{
		this.key=key;
	}
	@Override
	public INode<K> getNext()
	{
		return next;
	}
	@Override
	public void setNext(INode<K> next)
	{
		this.next=(MapMyNode<K,V>)next;
	}
	
	public V getValue()
	{
		return this.value;
	}
	public void setValue(V value)
	{
		this.value=value;
	}
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MapMyNode{" + "key=").append(this.key).append(" , value=").append(this.value).append('}');
		if(next != null) {
			myNodeString.append("->").append(next);
		}
		return myNodeString.toString();
	}	
}
