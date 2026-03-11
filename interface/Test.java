
//interface are similar to the abstract class but having all the methods of abstract type
//Ineterface is class ka blueprint which specifies what a class must do and not how.
/**
 it was used to achieve abstraction,
 it supports multiple inheritance.
 it can be used to achieve loose coupling,means changes made in one wouldn't changes the other.
 we cannot create the object of the interface.
 */
public interface I1 {
    //interface has:
//methods(abstract only)//compiler writes the keyword public by defualt ,so all method are public abstract 
// fields-->public static final
//eg.int a=10;//compiler will understand it as, public static final int a=10;
//java 8th version we can create default concreate method and we can create static methods,but the acess modifier of that will be public by default
//java 9th version --> we acn create private methods.
int a=10;
void show();
}
interface I2{
    void display();
}

class Test implements I1,I2{//here is multipule iheritance
   public void show(){//must define as public because in method ovveriding the acces modifier of the child class method must be bigger or the equal to the parent class method, as in the here parent interface method is show whixh is by default assigned as public by compiler as per rules of interface,so we can only write as public show in test class
        System.out.println("1");
    }

    void display(){
        System.out.println("2");
    }
    public static void main(String[] args){
        //I1 i = new I1();cannot create the object of the inerface
        Test t = new t();
        t.show();
        t.display();
    }
}
/*
an abstract class can extend another java class and implement multiple Java interfaces.
while ,an interface can extend another Java interace only.
*/
