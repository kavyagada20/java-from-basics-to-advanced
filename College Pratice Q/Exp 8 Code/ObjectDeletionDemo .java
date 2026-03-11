//d. WAP to create an object of a class, delete the same object by calling System. gc () and display  a message that the “object has been deleted”. Code: 
class ObjectDeletionDemo 
{ 
 public static void main(String[] args)  
{ 
 MyClass obj = new MyClass(); // Create an object of MyClass  System.out.println("Object created"); 
 obj = null; // Assign null to the object reference 
 System.gc(); // Request garbage collection
 System.out.println("Garbage collection requested"); 
 } 
} 
class MyClass 
{ 
protected void finalize() throws Throwable  
{ 
 System.out.println("Object has been deleted"); 
 } 
  
} 
/* 
OUTPUT: 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8>javac  ObjectDeletionDemo.java 
ObjectDeletionDemo.java:19: warning: [removal] finalize() in Object has been deprecated and  marked for removal 
 protected void finalize() throws Throwable 
 ^ 
1 warning 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8>java  ObjectDeletionDemo 
Object created 
Garbage collection requested 
Object has been deleted 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 8> 
In this program, the MyClass class is a nested class inside the ObjectDeletionExample class. When an  object of MyClass is created and then assigned null, it becomes eligible for garbage collection. The  finalize() method is overridden in MyClass to display the message "Object has been deleted" when  the object is garbage collected. 
Please note that calling System.gc() only suggests the Java Virtual Machine (JVM) to perform  garbage collection, but it doesn't guarantee immediate execution. The JVM decides when to  perform garbage collection based on its own algorithm and memory management strategy. 
*/
