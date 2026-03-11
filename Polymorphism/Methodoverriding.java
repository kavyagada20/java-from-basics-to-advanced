/* Run Time Polymorphism -->Dynamic Polymorphism
-It's achieve using the method overriding
-Handled by JVM
Method Overriding:Same method name in different class with same arguments(i.e same any of either no arguments,sequence of the argument or types of argument.)
-there should inheritance(IA-A Relationship)
*/

// class Test{
//         void show(){
//             System.out.println("method of class Test(parent class)");
//         }
//     }

// class XYZ extends Test{
//     void show( )
//     {
//         System.out.println("method of class XYZ(child class)");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();//running the method of the parent class (Test)
//         XYZ x = new XYZ();
//         x.show();

// //if we want to run the mthod of parent class inside the child class then we must use super key word .
// }
// }

//do Overriden method must have the same return type:-->From Java 5.0 onwards it is possible to have different return type for a overriding method in child class,but child's s return type //should be suntype of parent 's return type.this phenomenon is called as covarent return type.
/*
class Test1{
    Object show(){
        System.out.println("1");
           return null;
    }

}
class Xyz extends Test1
{
    String show(){
         System.out.println("2");
         return null;
        }
        public static void main(String[] args) {
            Test1 t1 = new Test1();
            t1.show();
    
            Xyz x1 = new Xyz();
            x1.show();
        }
}
*/

//Overriding and the access modifier -->
//access modifier of the class methos should is same or bigger as comapred to the the parent class method
/*
OVERRIDING AND EXCEPTION HANDLING-->
*/

/*
Overriding and the abstract method
*/

/*
Invoking overriden method form the subclass
*/
class Test1 {
    void show(){
        System.out.println("1");
    }

}
class Xyz extends Test1
{
    void show(){
	 super.show();//reffers to the mthod of the parent class
         System.out.println("2");
        }
        public static void main(String[] args) {
            Xyz x1 = new Xyz();//
            x1.show();
        }
}
