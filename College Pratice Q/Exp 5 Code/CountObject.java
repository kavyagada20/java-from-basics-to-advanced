
//WAP to count the number of objects made of a particular class using static variable and static  method to display the same. 

public class CountObject  
{  
private static int count;  
//constructor of the class  
public CountObject()  
{  
// increase the count variable by 1  
count++;  
}  
public static int displayCount() 
{ 
return count; 
} 
public static void main(String args[])  
{  
//creating objects  
CountObject ob1 = new CountObject();  
CountObject ob2 = new CountObject();  
CountObject ob3 = new CountObject(); 
CountObject ob4 = new CountObject();  
CountObject ob5 = new CountObject();  
//prints number of objects  
System.out.print("Total Number of Objects: " + displayCount());  
}  
} 
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5>javac CountObject.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5>java CountObject Total Number of Objects: 5 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5> */
