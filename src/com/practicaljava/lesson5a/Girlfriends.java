package com.practicaljava.lesson5a;

/*
 * Creating arrays
 * Populating arrays
 * Loop through an array
 */
public class Girlfriends 
{
	/*Array def:
	 * Data storage that's used to store multiple
	 * values of the same type.
	 * 1st element is 0 in Java
	 */
	
	public static void main(String[] args) 
	{
		//Declare and instantiate array
		String [] friends = new String[20];
		//initialise first element
		friends[0] = "Masha";
		friends[1] = "Emily";
		friends[2] = "Matilda";
		friends[3] = "Rosa";
		
		//Another way, notice curly brackets
		String [] friends2 = {"Masha","Matilda","etc"};
		
		System.out.println("Third girl's name is: " + friends[2]);
		System.out.println("Second girls name is: " + friends2[1]);
		
		 //Array has property .length
		int totalFriends = friends.length;
		
		
		//Multidimensional arrays....
		
		
	}
}
