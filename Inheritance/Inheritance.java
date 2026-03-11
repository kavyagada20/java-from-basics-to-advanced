import java.util.Scanner;

class {
{
    public static void main(String[] args) {
        // Scanner sc=new scanner(System.in);
        // System.out.println("");
        // int b=sc.nextInt();
        
        //creating an object of the based class
        base b=new base();
        b.setX(4);
        System.out.println(b.getX());
        
        //Creating an object of the derived class
        Derived c=new Derived();
        c.setX(12);
        System.out.println(c.getX());
        
        //this means that that the derived class has available all the the it's parent class;now they are accessible 
        //but they will be always accessible which is a another question ;it's about the Acess modifier as we have used public keyword ;but now we would be focusing only on the concept of 	theinheritance
        
        //base class cannot access the variable of its child class that is here Y ;it meeans that the parent class cannot access the variable of child class
        
        Derived d=new Derived();
        d.setY(102);
        System.out.println(d.getY());
	//There is Super class A which has a Subclass B ;we have written the constructor in A but now in b; but if write B obj=new B();then the contructor of parent class A will run ;we 	had written the constructor than then constructor of the parent class will run only after that constructor of the subclass B will run;
	/*if we had overloaded the costructor of the A,and we creating an object of class B;then by default compiler will run the constuctor of class A without the argument than constructor in class b;but we need to run the consturctot with the arguments than we must use the super key word in sub class
for eg: super(0);

	*/
    
    }
}

class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
         System.out.println("i am in base class setting x now");
        this.x=x;
    }
    public void printMe(){
         System.out.println("I am a....");
    }
}

class Derived extends base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
         System.out.println("i am setting y now");
        this.y=y;
    }
}
