package com.collectionFramework.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{ 
    public static void main (String[] args) 
    { 
        // Creating a list 
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);  // adds 1 at 0 index 
        l1.add(1, 2);  // adds 2 at 1 index
        l1.add(2, 2);
        System.out.println(l1);  // [1, 2, 2] 
  
        // Creating another list 
        List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); //index 0
        l2.add(2); //index 1
        l2.add(3); //index 2
        System.out.println(l2);  // [1, 2, 3] 
        
  
        // Will add list l2 from 1 index 
        l1.addAll(1, l2); 
        System.out.println(l1); //[1,1,2,3,2, 2]
  
        // Removes element from index 1 
        l1.remove(1);      
        System.out.println(l1); // [1,2,3,2, 2]
  
        // Prints element at index 3 
        System.out.println(l1.get(3)); 
        
        //System.out.println(l1.get(5)); //ArrayIndexOutOfBoundsException 
  
        // Replace 0th element with 5 
        l1.set(0, 5);    
        System.out.println(l1);  //[5,2,3,2,2]
        
        l1.add(0,10);
        System.out.println(l1); //[10,5,2,3,2,2]
        
        
     // Search using IndexOF
        List<String> l = new ArrayList<String>(); 
        l.add("JAK"); 
        l.add("for"); 
        l.add("Geeks"); 
        l.add("Geeks");
        l.add("JAK"); 
        l.add("Geeks");
        l.add("Geeks");
        l.add("Geeks");
        l.add("Test");  
        // Using indexOf() and lastIndexOf() 
        System.out.println("first index of Geeks:" +  l.indexOf("Geeks"));
        System.out.println("last index of Geeks:" +   l.lastIndexOf("Geeks")); 
        System.out.println("Index of element"+ " not present : " + l.indexOf("Hello")); //return -1
        
        
        //Sublist
        List<String> l3 = new ArrayList<String>(5);        
        l3.add("GeeksforGeeks"); //0
        l3.add("Practice"); //1
        l3.add("GeeksQuiz"); //2
        l3.add("IDE"); //3
        l3.add("Courses");//4 
  
        List<String> range = new ArrayList<String>(); 
  
        // Return List between 2nd(including) 
        // and 4th element(excluding) 
        range = l3.subList(2, 4);  
        System.out.println(range);  
        
        l3.contains("IDE");
        l.size();
        
        int j = 0;
        for(int i=0 ; i < l.size() ;i++) {
        	if(l.get(i).equals("Geeks"))
        		j++;//j = j+1;
        }
        
        System.out.println(j);


        
    } 
} 
