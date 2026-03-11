//c. Demonstrate using a suitable example that a base class reference variable can point to a child  class object using the concept of dynamic method dispatch. Code: 

import java.lang.*; 
import java.util.*; 
class A 
{ 
A() 
{ 
super(); //this super() method will class Paernt class Object which is default parent  class of user defined class 
System.out.println("In the Constructor of Class A"); 
} 
public void show() 
{ 
System.out.println("This is in Show Method of Class A"); 
} 
} 
class B extends A 
{ 
B() 
{ 
super(); 
System.out.println("In the Constructor of Class B"); 
} 
public void show() 
{ 
super.show(); //to call superclall A show method from overridden subclass show()  method use super keyward 
System.out.println("This is in Show Method of Class B"); 
} 
} 
class C extends B 
{ 
C() 
{ 
System.out.println("In the Constructor of Class C"); 
}
public void show() 
{ 
System.out.println("This is in Show Method of Class C"); 
} 
} 
class DynamicMethodDispatch 
{ 
public static void main(String args[]) 
{ 
 // Implementation of Dynamic Method Dispatch 
 A obj; // Reference of Base Class 
 obj=new C(); //Dynamically working as a object of class C  
 obj.show(); 
 obj=new B(); //Dynamically changing its refernece and working as a object of class  C  
 obj.show(); 
  
} 
} 
/* 
OUTPUT: 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8>javac  DynamicMethodDispatch.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8>java  DynamicMethodDispatch 
In the Constructor of Class A 
In the Constructor of Class B 
In the Constructor of Class C 
This is in Show Method of Class C 
In the Constructor of Class A 
In the Constructor of Class B 
This is in Show Method of Class A 
This is in Show Method of Class B 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8> */ 
