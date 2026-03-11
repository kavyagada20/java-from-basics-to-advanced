
/*
Uses of this keyword:-

 1.this keyword refers to the the current class instance variable.
 2.this keyword can be used to invoke current class method(implicitly).
 3.this() can used to invoke current class constructor.
 4.this can be used to pass as an argument in the method call.
 5.this can be used to pass an argument in the constructor call.
 6.this can be used to return the current class instance fromt he method.
 */

 //1.this keyword refers to the the current class instance variable.
class ThisDemo{
 int i;
 void setValue(int i){
    this.i=i;
 }
 void show(){
    System.out.println(i);
 }
}

//2.this keyword can be used to invoke current class method(implicitly).
class ThisDemo1{
    void display(){
       System.out.println("hello!");
    }
    void show(){
       display();//this.display() if we haven't use the this keyword here compiler use add by itself while invoking the method.
    }
}

// 3.this() can used to invoke current class constructor.
class ThisDemo2{
    ThisDemo2(){
        System.out.println("no argument constructor");
    }
    ThisDemo2(int a){
        System.out.println("parameterized constructor");
    }
}

//4.this can be used to pass as an argument in the method call.

class ThisDemo3 {
    void m1(ThisDemo3 td3) {
        System.out.println("in m1 Method");
    }
    void m2() {
        m1(this);//here we are using property 4
    }   
}

//5.this can be used to pass an argument in the constructor call.

class ThisDemo4 {
    ThisDemo4(ThisDemo41 td4){
        System.out.println("ThisDemo4 class Constructer.");
    }
}

class ThisDemo41{
    void a1() {
        ThisDemo4 a =new ThisDemo4(this);
    }
}

//6.this can be used to return the current class instance from the method.

class ThisDemo5{
    ThisDemo5 b(){//Here instead of the void we are using ThisDemo5 as a return type.
        return this;//6.as this can be used to return the current class instance from the method.
    }
}

public class UsesOfTHisKeyword {
    public static void main(String[] args) {
       ThisDemo td =new ThisDemo();
       td.show();

       ThisDemo1 td1 =new ThisDemo1();
       td1.show();

       ThisDemo2 td2 =new ThisDemo2();
       ThisDemo2 td21 =new ThisDemo2(2);

       ThisDemo3 td3 =new ThisDemo3();
       td3.m2();

       //ThisDemo4 td4 =new ThisDemo4(this);// error: non-static variable this cannot be referenced from a static context;and This is non ststic variable
       ThisDemo41 td4 =new ThisDemo41();
       td4.a1();

       ThisDemo5 td5 =new ThisDemo5();
       td5.b();
    }
    
}