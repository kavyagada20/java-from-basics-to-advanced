
/*
Static variables are used for memory mangement at the backend.:-when static variable is declared as static,then a single copy of variable is created and dhared among all objects at class levels.thus,static variable name for eg. comapny name will be shared among e1,e2 and all the objects.whichever variable can used to reffer the common propeert or value for all objecta,comapny,name of the employees,college name of students etc,etc.

//Static variables occupys the memory at the class area and object allocates memory at heap area.

 * Static Keyword is non access modifier keywords
 
 Access Modifier-->public,protected,private,defualt(No Modifiers)

 Non Access Modifiers:-
 static,final,abstract,synchronized,transient,volatile,scrictfp

 We can use static keywors with:-
 1.variable->of class level,we cannot use it with the class level variable.
 2.methods
 3.Block
 4.inner class(nested class)
 #Note :-we cannot use the static variable with the outer class.

 */
//1.Static Variables
public class StaticVariables {
    static int a=10;//static declaration is allowed with instances variable
    
    // void m1(){
    //    //static int b=20;not allowed with the local variables.
    // }

    public static void main(String[] args) {
        System.out.println(StaticVariables.a);//for static variables we can directly use class,we don't require create object.
        /* 
        Employee e1 = new Employee(101,"Amit","Sp");
        e1.display();
        Employee e2 = new Employee(102,"Deepak","Sp");
        e2.display();
        */
        EmployeeOptimizedMemoeryAllocationUsingStatic e1 = new EmployeeOptimizedMemoeryAllocationUsingStatic(101,"Amit");
        e1.display();
        EmployeeOptimizedMemoeryAllocationUsingStatic e2 = new EmployeeOptimizedMemoeryAllocationUsingStatic(102,"Deepak");
        e2.display();
//only 2 variables empid and name used for memory allocation and comany name is same for all is stored in method area.
    }

}
/* 
class Employee{
    int empid;
    String name;
    String company;

    void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    Employee(int empid,String name,String company){
        this.empid=empid;
        this.name=name;
        this.company=company;
    }
}
*/

class EmployeeOptimizedMemoeryAllocationUsingStatic {
    int empid;
    String name;
    static String company="Smart Programming";

    EmployeeOptimizedMemoeryAllocationUsingStatic(int empid,String name){
        this.empid=empid;
        this.name=name;
    }

    void display(){
        System.out.println(empid+" "+name);
    }
}
//in both the cases the references of the object is stored in stack memory.

