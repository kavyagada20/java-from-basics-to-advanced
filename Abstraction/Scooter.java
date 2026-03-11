/*
OOPS
-CLASS
OBJECT AND METHODS

 1st module of oops-->For code reusibilty
 -Inheritance
 --Is a relaation
 --has a relation
 -polymorphism
 --method overloading and overriding

 2nd module of oops-->For security
 -Abstraction
 -data hiding
 -Encapulation
 -Tightly coupled classes
 */

 //Abstraction is detail hiding /hiding internal implementations just highlighting the setup services that are offering.
 /*
   1. by using abstract class(0 -100 %)
  2. interfaces(100 %)
  */

  /*Abstract method is such that which is without body(no implementation);and if in any class there is abstract method then class too must declared as a abstract class but class is declared as abstract then it isnt neccessary that it will have the abstract method.
  If any class inherites the abstract class, then class must to implements all the methods of abstract class or class has to be declared abstract as well.

  Abstract method in abstract class are meant to be overridden in derived concrete classes otherwise compile time polymorphism will be thrown.
  WE CANNOT CREATE OBJECT OF THE ABSTRACT CLASS,we let's consider if we can create the object of the abstract class and we ca;; the object which has no body, which doesnt make sense.;that's why wwe cant.
  ABSTRACT CLASS CANNOT BE INSTANTIATED.
  */

  public class vehicle {
    abstract void start();
}
class Car extends vehicle {
  void start(){
    System.out.println("Car starts with the key");
  }
}
class Scooter extends vehicle {
  void start(){
    System.out.println("Scooter starts with the kick");
  }
  //cannot create object of the abstract class

  public static void main(String[] args){
    //vehicle v = new vehicle();
    Car c = new Car();
    c.start();

    Scooter s = new Scooter();
    s.start();
  }
}
