/* a. WAP to implement three classes namely Student, Test and Result. Student class has member  as rollno, and read(). Test class has members as sem1_marks and sem2_marks and read().  Result class has member as total. Create an interface named sports that has a member score  (). Derive Test class from Student and Result class has multiple inheritances from Test and  Sports. Total is formula based on sem1_marks, sem2_mark and score. 

Code: */

import java.util.*; 
class Student 
{ 
int rollNo; 
Scanner sc=new Scanner(System.in); 
public void read() 
{ 
System.out.println("Enter Roll Number:"); 
rollNo=sc.nextInt(); 
} 
} 
class Test extends Student 
{ 
int sem_I_Marks,sem_II_Marks; 
Scanner sc=new Scanner(System.in); 
public void read() 
{ 
super.read(); 
System.out.println("Enter Semester I Marks:"); 
sem_I_Marks=sc.nextInt(); 
System.out.println("Enter Semester II Marks:"); 
sem_II_Marks=sc.nextInt(); 
} 
} 
interface Sports 
{ 
int score();
} 
class Result extends Test implements Sports 
{ 
public int score() 
{ 
return 90; //marks of sports 
} 
public void displayResult() 
{ 
System.out.println("****Student Result****"); 
System.out.println("Roll Number:"+rollNo); 
System.out.println("Sem-I Marks: "+sem_I_Marks+" & Sem II  marks:"+sem_II_Marks); 
System.out.println("Sports Score:"+score()); 
int total=sem_I_Marks+sem_II_Marks+score(); 
System.out.println("Total marks:"+total); 
} 
} 
class StudentResult 0
{ 
public static void main(String args[]) 
{ 
Result rs=new Result(); 
 rs.read(); 
 rs.displayResult(); 
} 
} 
/* 
OUTPUT: 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8>javac  StudentResult.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8>java StudentResult Enter Roll Number: 
10 
Enter Semester I Marks: 
87 
Enter Semester II Marks: 
89 
****Student Result**** 
Roll Number:10 
Sem-I Marks: 87 & Sem II marks:89 
Sports Score:90 
Total marks:266 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8> */
