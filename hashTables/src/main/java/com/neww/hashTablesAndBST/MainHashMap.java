package com.neww.hashTablesAndBST;
/*
 * Main class to perform the operations of hash map
 * UC 1 - to get the frequency of words in a sentence.
 * UC 2 - to get the frequency of the words in a Paragraph.
 * @param sentence is used to write the input i.e., either a sentence or a paragraph
 * @param words is used to split the words in a sentence.
 * @frequency tells the no. of times the word occured in a sentence/Paragraph.
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
		int deleteAWord = myNewHashMap.get("avoidable");
		myNewHashMap.deleteWord("paranoids", deleteAWord);
		System.out.println("The Word 'paranoids' is Deleted.");	
		System.out.println(myNewHashMap);
	}

}
