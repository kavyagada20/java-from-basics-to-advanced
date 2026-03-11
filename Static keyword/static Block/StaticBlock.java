/*
METHOD VS BLOCK
 Block -->It is a block of instruction with no identity.No input and ouput.We cannot access  block explicitly(manually).it will execute automatically in java appliacations.It ca be either static or non static.
 

 Method-->It is a block of instruction with no identity.No input and ouput.We can call explicitly usiing its identity.
 returntype Identity(arguments){
    //logic
 }
 

 //how can we create objexct inside static block?
class Test{
    static{
        Test x=new Test();//here,x is local variable
        Sop(x);
    }
    p s v m(String args[]){
        //Sop(x);//we cannot x here since local variable(object refrence variable) of static block

    }
}

// global object refernce variable for static block :-
class Test{
    static Test x= null;//x is Internal pointer
}
static{
    Test.x=new Test();
    Sop(x);
}
main(){
    sop(x);//allowed
}

*/

/*
 
 */
public class StaticBlock {
    static{
        System.out.println("hello");
    }
    static{
        System.out.println("I am the 2rd ststic block");
    }
    public static void main(String[] args) {
        System.out.println("I am the main method");
    }
    static{
        System.out.println("I am the 3rd ststic block");
    }


    //static block executed automatically when the class is loaded in the memory.
    //question arises it run automatically,then do main method is required ,if we dont declared the main method then too it will run?
    //ans is yes,but we must need jdk 1.6 version or version before it.Ater 1.6 method creating main method is neccessary.
    //but static block will be executed 1st i.e. before main method wherever we have return above main orelse below it.
    /*
     *
     * can we created the multiple static block? Yes
     * All the Static member execution is from top to bottom till jdk version 1.6.In latest version it check all the static members from top to botton and check whether there is main method in program then it will run firstly,all the Static member execution is from top to bottom ,follwed by the main method
     */
    /*
     * USE OF STATIC BLOCK
     1.static block is executed at class loading,hence at the time of class loading if we want to perform any activity,we have to define that inside the static block.
     for eg. native methods-->jinka code kisi dusri language ke andar implement kiya jata he woh hota he native method,we will lern more about it lately.
     2.Static block is used to intialised the static members
     */
}
