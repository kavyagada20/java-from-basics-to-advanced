public class Methodoverloadingharry{	
    static void foo(){
       System.out.println("GM broo"); 
    }
    static void foo(int x,int b){//they are parameters here x and b
       System.out.println("GM "+x+" bro"); 
       System.out.println("GM "+b+" bro"); 
    }
    
    public static void main(String[] args) {
    foo();
    int a;
    foo(3000,4000);//they are arguments
    //arguments are are actuals values here 3000 and 4000
    //method overloading cannot be performed by changing the return type to the same method
    
    }
}