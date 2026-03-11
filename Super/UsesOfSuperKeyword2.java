/**
 2."Super" Keyword can be used to invoke immediate parent class method.
 */

 class A{
    int i=10;
    void m1(){
        System.out.println("I m in class A");
    }
 }
public class UsesOfSuperKeyword2 extends A {
    void m1(){//Method Overriding concept
        System.out.println("I m in class B");
    }
    void show(){
        m1();
        super.m1();//we can call parent class method using the super keyword. and there wont be an ambuiquity error.
    }
public static void main(String[] args) {
    UsesOfSuperKeyword2 ob = new UsesOfSuperKeyword2();
    ob.show();
}
    
}