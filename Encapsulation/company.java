/*
eg. of Encapulation--> Main medicine is enclosed in capsule,engine breaking and gear system etc are hided from the driver.
Encapulation in java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 

Steps to achieve Encapsulation:-
1.Declare the variables of a class as privates.
2.Provide public setter and getter methods to modify and view the variables values.
*/

// Class Employee{
//    int empid; 
// }
// class Company{
//     public static void main(String[] args) {
//         Employee e = new Employee();
//         e.empid=101;
//     }
// }

//sometimes data which is sensitive we must use the concept of encapulsation not making it as easily accessible;by the above method the data was easily accessible !
class Employee{
    private int empid;//Data hiding

    public void setEmpid(int eid){
        empid=eid;
    }
    public int getEmpid(){
        return empid;
    }
}
class company{
    public static void main(String[] args) {
    Employee e = new Employee();
    e.setEmpid(102);
    System.out.println(e.getEmpid());
    
   }
}