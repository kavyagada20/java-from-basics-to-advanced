/* 
WAP to add n strings in a vector array. Input new string and check if it is present in the vector. If  present delete it else add to the vector */ 
import java.util.*; 
 class SearchAndAddOrDeleteStringInVector 
 { 
 public static void main(String args[]) 
 { 
 Vector<String> v=new Vector<String>(); 
 //to read Names from Command Line arguments and store in to vector v.add(args[0]); 
 v.add(args[1]);
 v.add(args[2]); 
 v.add(args[3]); 
 v.add(args[4]); 
  
 System.out.println("Elements in Vector Before Operation: "+v); 
  
 System.out.println("Enter String to be Search in Vector:"); 
 Scanner sc=new Scanner(System.in); 
 String str=sc.next();  
  
 if(v.contains(str)) 
{ 
v.removeElement(str); 
  
 } 
 else 
{ 
System.out.println("in else"); 
v.addElement(str); 
} 
 System.out.println("Elements in Vector after Add or Removed input String: "+v);   
 } 
 } 
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 4>javac  SearchAndAddOrDeleteStringInVector.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 4>java  SearchAndAddOrDeleteStringInVector Sudhir Nilesh Surekha Komal Hezal Elements in Vector Before Operation: [Sudhir, Nilesh, Surekha, Komal, Hezal] Enter String to be Search in Vector: 
Surekha 
Elements in Vector after Add or Removed input String: [Sudhir, Nilesh, Komal, Hezal] 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 4>java  SearchAndAddOrDeleteStringInVector Sudhir Nilesh Surekha Komal Hezal Elements in Vector Before Operation: [Sudhir, Nilesh, Surekha, Komal, Hezal] Enter String to be Search in Vector: 
Vishakha 
in else 
Elements in Vector after Add or Removed input String: [Sudhir, Nilesh, Surekha, Komal, Hezal,  Vishakha] 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 4> */
