//1. To implement Constructors and constructor overloading 
//a. WAOP to count the no. of objects created of a class using constructors. 

public class CountObject  
{  
private static int count;  
//constructor of the class  
public CountObject()  
{  
// increase the count variable by 1  
count++;  
}  
public CountObject(int a)  
{  
// increase the count variable by 1  
count++;  
}  
public CountObject(int a, float b)  
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
CountObject ob2 = new CountObject(12);  
CountObject ob3 = new CountObject(22);  
CountObject ob4 = new CountObject(10,4.55f);  
CountObject ob5 = new CountObject(66,7.44f);  
//prints number of objects  
System.out.print("Total Number of Objects: " + displayCount());  
}  
} 
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5>javac CountObject.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5>java CountObject Total Number of Objects: 5 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5> */ 
