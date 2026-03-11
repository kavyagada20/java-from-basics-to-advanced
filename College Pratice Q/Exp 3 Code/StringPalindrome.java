//WAP to check if a string is a palindrome or not using inbuild functions.
 import java.util.Scanner; 
public class StringPalindrome 
{ 
public static void main(String[] args) 
{ 
//Scanner is a class used to get the output from the user 
Scanner sc=new Scanner(System.in); 
//Input the string 
System.out.println("Enter the string!"); 
String s=sc.nextLine(); 
StringBuffer sb=new StringBuffer(s); 
sb=sb.reverse(); 
String rev=sb.toString();//converting stringBuffer object ot string object 
if(s.compareTo(rev)==0) 
{ 
System.out.println("String+ "+s+" is Palindrome"); 
} 
else 
{ 
System.out.println("String+ "+s+" is Not Palindrome"); 
} 
} 
} 
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3>javac  StringPalindrome.java
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3>java StringPalindrome Enter the string! 
RacecaR 
String+ RacecaR is Palindrome 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3>java StringPalindrome Enter the string! 
CarRace 
String+ CarRace is Not Palindrome 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3> */
