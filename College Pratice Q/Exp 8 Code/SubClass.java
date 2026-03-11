//b. Demonstrate that a variable is constant, method cannot be overridden, class cannot be  inherited using final keyword.  Code: 

import java.util.*; 
final class SuperClass 
{ 
public static final double PI=3.14; 
SuperClass() 
{ 
PI=PI+1; 
System.out.println("PI="+PI); 
} 
public final void method() 
{ 
System.out.println("this method is in Super Class"); 
} 
}  
class DerivedClass extends SuperClass 
{ 
} 
class SubClass extends SuperClass 
{ 
public final void method() 
{ 
System.out.println("this method is in Sub Class"); 
} 
public static void main(String args[]) 
{ 
SuperClass s=new SuperClass(); 
 s.method(); 
} 
} 
/* 
OUTPUT : 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8>javac SubClass.java SubClass.java:20: error: cannot inherit from final SuperClass 
class DerivedClass extends SuperClass 
 ^ 
SubClass.java:27: error: cannot inherit from final SuperClass 
class SubClass extends SuperClass 
 ^
SubClass.java:10: error: cannot assign a value to final variable PI 
 PI=PI+1; 
 ^ 
SubClass.java:29: error: method() in SubClass cannot override method() in SuperClass  public final void method() 
 ^ 
 overridden method is final 
4 errors 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8> */ 
