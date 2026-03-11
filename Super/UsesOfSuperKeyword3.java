
// 3.Super() can be used to invoke immediate parent class constructor.

class A{
    A(){
        System.out.println("I m in class A");
    }
}
public class UsesOfSuperKeyword3 extends A {
    UsesOfSuperKeyword3(){
        super();//compiler writes it by default if we dont write so it isnt neccessary to write it out.
        System.out.println("I m in class UsesOfSuperKeyword3");
    }
    public static void main(String[] args) {
        UsesOfSuperKeyword3 ob = new UsesOfSuperKeyword3();
        
    }
/*
 * C:\kavya\java\Super>javac UsesOfSuperKeyword3.java

C:\kavya\java\Super>java UsesOfSuperKeyword3
I m in class A
I m in class UsesOfSuperKeyword3
 */

 //Here,we arent used the super() method,compiler by default adds it.That is why the parent class constructor is runned first.

 /*
  imp interview Q-->
 
 super is keyword which is refferring to the parent class instance variable and super() is a method which is used to run the parent class constructor
  */
}
