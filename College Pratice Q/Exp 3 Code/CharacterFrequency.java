//WAP to count the frequency of occurrence of a given character in a given line of text. 

import java.util.Scanner; 
public class CharacterFrequency 
{ 
public static void main(String[] args) 
{ 
//Scanner is a class used to get the output from the user 
Scanner sc=new Scanner(System.in); 
//Input the string 
System.out.println("Enter the string!"); 
String s=sc.nextLine(); 
//counter to count the uppercase and lowercase letters  
int frequency=0; 
System.out.println("Enter the Character to find its frequency: "); 
char ch=sc.next().charAt(0); 
//looping until the string length is zero 
for(int i=0;i<s.length();i++) 
{ 
if(s.charAt(i)==ch) 
frequency++; 
} 
//Print the output  
System.out.println("The Character"+ ch+ "has occurred "+frequency+" Times"); } 
}
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3>javac  CharacterFrequency.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3>java  CharacterFrequency 
Enter the string! 
ENGINEERING 
Enter the Character to find its frequency: 
E 
The CharacterEhas occurred 3 Times 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3> */ 
