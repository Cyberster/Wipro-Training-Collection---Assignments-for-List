/*
Create an ArrayList which will be able to store only Strings. Create a printAll 
method which will print all the elements using an Iterator.
 * */

package com.w3epic.wiprotraining.assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
