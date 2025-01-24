package com.problem.solving.questions.codingninjas;

import java.util.Map;
import java.util.TreeMap;

public class ReverseOnlyLetters {
	
	 public static String reverseOnlyLetters(String s) {
	        // Write your code here.

	          Map<Integer,Character> list= new TreeMap<>();
	          
	          StringBuffer sb= new StringBuffer();
	          
	               
	          for(int i=0;i<s.length();i++){

	              if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
	                   sb.append(s.charAt(i));

	              }else {
	            	  
	            	  
	            	  list.put(i, s.charAt(i));
	            	  
	              }
	          }
	              
	             StringBuffer bs= new StringBuffer();
	              
	             bs=sb.reverse();
	             
	            
	             
	             bs.insert(1, '-');
	             
	            System.out.println(bs.toString());

	              

	          
	          return null;
	 }

	public static void main(String[] args) {
	
            
reverseOnlyLetters("!s-cx");
        
	}
}
