package com.collectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccessLisiInDifferentWays {

	public static void main(String[] args) {
		 List<String> l = new ArrayList<String>(); 
	        l.add("JAK"); 
	        l.add("for"); 
	        l.add("Geeks"); 
	        l.add("Geeks");
	        l.add("Geeks");
	        l.add("Geeks");
	        l.add("Geeks");
	        l.add("Test"); 
	        
	        
	        System.out.println(l);
	        
	        
	        //Iterator
	        System.out.println("Using iterator");
	        Iterator<String> iterate = l.iterator();
	        while(iterate.hasNext()) {
	        	System.out.println(iterate.next());
	        }
	        
	        System.out.println("Using Normal For loop");
	        //Normal For loop
	        for(int i = 0 ; i < l.size() ; i++) {
	        	System.out.println(l.get(i));
	        }
	        
	        System.out.println("Using advanced for loop");
	        //Advances For loop
	        for(String item : l) {
	        	System.out.println(item);
	        }
	        
	        System.out.println("Using while");
	        //while
	        int j = 0;
	        while(j < l.size()) {
	        	System.out.println(l.get(j));
	        	j++;
	        }
	}

}
