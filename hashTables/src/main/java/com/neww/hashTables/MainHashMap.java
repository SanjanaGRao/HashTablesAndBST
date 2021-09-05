package com.neww.hashTables;
/*
 * Main class to perform the operations of hash map
 * @author Sanjana Rao
 * @since 5-9-2021
 */
public class MainHashMap {

	public static void main(String[] args) 
	{
		String sentence="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		ImplementHashMap<String,Integer> myNewHashMap = new ImplementHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		System.out.println("The words after splitting the sentence: ");
		for(String word:words)
		{
			System.out.println(word);
			Integer value=myNewHashMap.get(word);
			if(value==null) value=1;
			else
				value=value+1;
			myNewHashMap.add(word,value);
		}
		System.out.println(myNewHashMap);
		int frequency=myNewHashMap.get("paranoid");
		
		System.out.println("The frequency of 'paranoid' is: "+frequency);
	}

}
