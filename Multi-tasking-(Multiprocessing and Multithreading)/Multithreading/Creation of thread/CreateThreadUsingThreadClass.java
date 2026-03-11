/*
 We can create thread in java:
 1.USing Thread class
 2.USing Runnable interface

 java predefined class :

 package java.lang;

 public class Thread implemts Runnable {
    //constructors
    //methods
    -run()//overridden
    -start()
    -
    -
    -
    -
 }

java predefined interface :

 package java.lang;
 public interface Runnable{
    //method(only 1)
    -run()
 }
 
 */


class CreateThreadUsingThreadClass extends Thread {//Step 1:Extend the Thread class
   //Step 2:Override the run method
   //we provide the task of the thread in the run method
   public void run(){//access modifier should be public as we can see we are overiding in which method of parent class is define with some access specifier we must declare with the same or the greater(bigger) aaccess specifier in the overidden method.since,run is public in Threa class we must declare here as public.

      //task of the thread eg.
      System.out.println("THread task");
   }

   public static void main(String[] args) {
      //Create the object of the Test class
      CreateThreadUsingThreadClass t = new CreateThreadUsingThreadClass();
      //Step 4:Invoke the thread

      t.start();//start method register the task for thread scheduling(internal functionality)
      //for interview perspective we can ans that,through start meethod the run method is called,and it create a call  for

      //if we write t.run(); we have not createed the thread;thus we must satisty all the method.

     // t.start();//Exception:we cannot invoke the thread again
      //Exception in thread "main" THread task
// java.lang.IllegalThreadStateException
   }
}

