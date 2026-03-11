/*RULES FOR STATIC METHOD:--

  1.Static Method belongs to the class,not object.
  2.Static method can be called directly by class namesas follows:ClassName.methodName();
  (sTATIC METHOD CAN BE ACCESSED directly by class name and doesn't need any object.)
  3.ststic method can access only static data.it cannot access non-ststic data(instance data).
  4. A static method can call only other static methods and cannot call a non static method.
  5.Static method cannot refer to "this" or "super" keyword in anyway.
 */
class StaticMethod{

    void display(){
        System.out.println("Normal method");
    }

    static void show(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        StaticMethod t = new StaticMethod();
        t.display();
        StaticMethod.show();
        show();
        Xy.m1();
        //If there are mutliple class then class name is require,and we we want to call the method within the class then class name is also not required
        //Static keyword are used for memory mangement,wwe are not required to create the object,thus memory is saved and the speed of the program is increased.
        //non Static method cannot be refrenced to from the static context.
        staticDemo.a();
    }
}

class Xy{
    static void m1(){
        System.out.println("hehe");
    }
}

class staticDemo{
    static int i=10;//non-static variable i cannot be referenced from a static context
    static void a(){
       // eat();//non-static method eat() cannot be referenced from a static context
        //System.out.println(this.i);// non-static variable this cannot be referenced from a static context
        System.out.println(i);
    }
    void eat(){
        System.out.println("2");
    }
}

//Why main() is public and static?
/*
Static is free accessed and non static is restricted and permission are required.
non Static-->Specific to one objeect .eg. account no.
Static is common to more than 1 obj,
eg:IFSC CODE IS COOMON but for the account holder of 1 particular branch.(few)
BANK NAME-->common (all).

Access modfier:-
private,<package>(default),protected ,public
 
 */