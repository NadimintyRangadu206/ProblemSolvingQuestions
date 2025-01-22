package com.problem.solving.questions.upstop;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class BasKetBallGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc= new Scanner(System.in);

        int x=sc.nextInt();

        StringBuffer sb= new StringBuffer();

        for(int i=0;i<8;i++){

           String s=sc.next();  

            sb.append(s);    

        }

         char ch[]=sb.toString().toCharArray();

         ArrayList<Integer> list= new ArrayList<>();
 
          for(int i=0;i<ch.length;i++){
          
          switch(ch[i]){

            case '+':
            int n1=list.get(i-1);

            int n2=list.get(i-2);

            int n3=n1+n2;

            list.add(n3);
                 
            break;

            case 'C':

          int n4=list.get(i-1);
               
               int n5=list.get(i);

               list.remove(n5);

            break;

            case 'D':

            int n7=list.get(i-1);
            
            list.add(n7*2);

            break;

            default :
                  
                  int x1=ch[0];
                  int x2=ch[1];
               list.add(x1);
               list.add(x2);   

            break;
            
          }

          }

          int sum=0;
          for(int i=0;i<list.size();i++){

             sum+=list.get(i);
          }
         
        System.out.print(sum);
    }
}