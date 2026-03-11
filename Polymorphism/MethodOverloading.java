/*Polymorphism-->poly means many and morphism means forms
eg.1. water-->solid,liquid ,gas
2.shapes-->circle,triangle,rec
3.sound-->roar,cry

Types of Polymorphism 
1.Compile Time Polymorphism -->static polymorphism 
-It's achieve using the method overloading
-Handled by compiler
2.Run Time Polymorphism -->Dynamic Polymorphism
-It's achieve using the method overriding
-Handled by JVM

Method Overloading:
1.Same  method name within same class with different arguments either no arguments,sequence of the argument or types of argument.
(which same any of either no arguments,sequence of the argument or types of argument.)
2.Method Overriding:Same method name in different class with same arguments(which same any of either no arguments,sequence of the argument or types of argument.)


*/
// class Test{
//     void show(){
//         System.out.println("1");
//     }
//     // void show(){
//     //     System.out.println("2");
//     // }
//     public static void main(String[] args){
//         Test t = Test();
//         t.show();
//         // THere is a ambiquity error ,since there are 2 show method in with same name with same parameter
//     }
// }
class MethodOverloading{//it is Compiletime polymorphism
//methods for 1st way
    // void show(int a,int b){
    //     {
    //         System.out.println("1");
    //     }
    // }
    // void show(int a){
    //     {
    //         System.out.println("2");
    //     }
    // }
    //methods for the second way
    // void show(int a,String b){
    //     {
    //         System.out.println("1");
    //     }
    // }
    // void show(String b,int a){
    //     {
    //         System.out.println("2");
    //     }
    // }
    //methods for the 3rd way
    // void show(int a){
    //     {
    //         System.out.println("1");
    //     }
    // }
    // void show(String b){
    //     {
    //         System.out.println("2");
    //     }
    // }
    //on changinging the return type can we can achieve method overloading?No

    public static void main(String[] arg){
         MethodOverloading t = new MethodOverloading();
        //1st way
        // t.show(10,20);//here there were differnce in the parameters (data types)
        // t.show(20);
        //2nd way
        // t.show(3,"a");//here there is difference in sequences of same 2 datatypes
        // t.show("a",3);
        //3rd ways 
        // t.show("a");
        // t.show(4);
        System.out.println("1");
        t.main(32);
        // Eat e = new Eat();
        // e.show(null);
        // e.show(3);
        // e.show('a');
        //here in class eat only we have show method with 2 typees of arg;firstly int and 2nd String but we are putting char as arguments but isnt there does it is Aumotatic promated to the int types
        //Automatic promotion-->One type is promtoed to another type implicitly if no matching datatype is found.

        // Object o = new Object();
        // o.show("abc");
        // o.show(o);

        //Object is the parent classes of all the classes in java;Here Object is parent class and String is the Child class;while resovling the overloaded methods,compiler will always give prefrences to the child type argument with compared with the parent type argument.

        SameLevel s = new SameLevel();
        s.show("abc");
        // s.show(null);
        /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The method show(StringBuffer) is ambiguous for the type SameLevel */
       // t.show(new StringBuffer("xyz"));//Output Should be "in StringBuffer method"

        varags v = new varags();
        v.show(10);
        v.show(10,3,33);


    }

        //Can we overload main method()  ? Yes,we can overload main method
    public static void main(int a){
        System.out.println("3");
    }

}
class Eat{
    void show(int a){
        {
            System.out.println("int method");
        }
    }
    void show(String b){
        {
            System.out.println("String method");
        }
    }
}
class Object{
    void show(Object a){
            System.out.println("object method");
    }
    void show(String b){
            System.out.println("String method");
    }
}
//when the both the class of the same level then for eg. String and String buffer;both are the child class of the Object class
class SameLevel{
    void show(StringBuffer a){
        System.out.println("StringBuffer method");
    }
    void show(String b){
        System.out.println("String method");
    }
}
class varags{
    void show(int a){
        System.out.println("int method");
    }
    void show(int... b){
        System.out.println("Varags method");
    }
}