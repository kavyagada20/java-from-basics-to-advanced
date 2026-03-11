//1. To implement Inheritance 
//a. WAP to demonstrate the role of Constructors in inheritance in the following class  diagram 

//Code: 

import java.lang.*;
 import java.util.*; 
class A 
{ 
A() 
{ 

super(); //this super() method will class Paernt class Object which is default parent  class of user defined class 
System.out.println("In the Constructor of Class A"); 
} 
} 
class B extends A 
{ 
B() 
{ 
super(); 
System.out.println("In the Constructor of Class B"); 
} 
B(int a,int b) 
{ 
this(); 
System.out.println("Addition of"+a+" +"+b+" ="+(a+b)); 
} 
} 
class C extends B 
{ 
C() 
{ 
super(10,20); // super() method is to call super class default or parameterized  constructor 
System.out.println("In the Constructor of Class C"); 
} 
C(int a) 
{ 
this(); //this() method is to call overloaded consturctor of same class System.out.println("Value of a="+a); 
} 
} 
class ConstructorInInheritance 
{ 
public static void main(String args[]) 
{ 
C obj=new C(20); 
} 
} 
/* 
OUTPUT: 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 7>javac  ConstructorInInheritance.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 7>java  ConstructorInInheritance 
In the Constructor of Class A 
In the Constructor of Class B 
Addition of10 +20 =30 
In the Constructor of Class C 
Value of a=20 
*/
