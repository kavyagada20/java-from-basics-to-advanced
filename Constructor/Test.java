   Constructor is a block similar to the method having same name as that of class name but it does not have any return type not even void
    The only modifier appilcable for the constructors are public,protected,default and private
    It executes automatically when we create an object
    
    */
//Default constructor
// class Test{
//     // public Test(){
        
//     // }
//     int i;//defualt constructor intialized the value of 0
//     String s;
//     public static void main(String args[]){
//         Test t = new Test();//Default constructor
//         System.out.println(t.i+" "+t.s);
        
//     }
// }
//no argument constructor
// class Test{
//     public Test(){
//         System.out.println("no arg constructor");
//     }
//     int i;//defualt constructor intialized the value of 0
//     String s;
//     public static void main(String args[]){
//         Test t = new Test();//Default constructor
//         System.out.println(t.i+" "+t.s);
        
//     }
// }

//parameterised constructor
class Test{
    public Test(int a){
        System.out.println("no arg constructor");
    }
    int i;//defualt constructor intialized the value of 0
    String s;
    public static void main(String args[]){
        Test t = new Test(5);//Default constructor
        System.out.println(t.i+" "+t.s);
        
    }
}