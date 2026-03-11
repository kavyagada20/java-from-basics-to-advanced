/*To implement collections (Array List/ Vectors) 
WAP to accept students name from command line and store them in vector. */ 
 import java.util.*; 
 class VectorDemo 
 { 
 public static void main(String args[]) 
 { 
 Vector v=new Vector(); 
 //to read Names from Command Line arguments and store in to vector 
 v.add(args[0]); 
 v.add(args[1]); 
 v.add(args[2]); 
 v.add(args[3]); 
 v.add(args[4]); 
 Enumeration e=v.elements(); 
 System.out.println("Elements in Vector: "); 
 while(e.hasMoreElements()) 
 { 
 System.out.println(e.nextElement()); 
 } 
 } 
 } 
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 4>java VectorDemo  Sudhir Nilesh Komal Surekha Hezal 
Elements in Vector: 
Sudhir 
Nilesh 
Komal 
Surekha 
Hezal 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 4> 
*/ 
