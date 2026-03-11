import java.util.Scanner; 
public class StringParsing 
{ 
public static void main(String[] args) 
{ 
//Scanner is a class used to get the output from the user 
Scanner sc=new Scanner(System.in); 
//Input the string 
System.out.println("Enter the string!"); 
String s=sc.nextLine(); 
//counter to count the uppercase and lowercase letters  
int uppercase=0,lowercase=0, digit=0,blankSpace=0, specialCharacter=0; //looping until the string length is zero 
for(int i=0;i<s.length();i++) 
{ 
if(Character.isLowerCase(s.charAt(i))) 
{ 
lowercase++; 
} 
else if(Character.isUpperCase(s.charAt(i))) 
{ 
uppercase++; 
} 
else if(Character.isDigit(s.charAt(i))) 
{ 
digit++; 
} 
else if(s.charAt(i)==' ') 
{ 
blankSpace++; 
} 
else 
{ 
specialCharacter++; 
} 
} 
//Print the output  
System.out.println("No. of lowercase letter : " + lowercase); 
System.out.println("No. of uppercase letter : " + uppercase); 
System.out.println("No. of Digits : " + digit); 
System.out.println("No. of Blank Spaces : " + blankSpace); 
System.out.println("No. of Special Characters: " + specialCharacter); 
//to give a space of one line 
System.out.println();
} 
} 
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3>javac  StringParsing.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3>java StringParsing Enter the string! 
Hi my Mail Id is: abcd_1987@gmail.com 
No. of lowercase letter : 21 
No. of uppercase letter : 3 
No. of Digits : 4 
No. of Blank Spaces : 5 
No. of Special Characters: 4 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 3> 
*/ 
