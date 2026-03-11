class DynamicMethodDispatch {

//it is necessary for the run time polymorphism
//overriding is a kind of a polymorphism

    public static void main(String[] args) {
        // Phone obj = new Phone();//Allowed
        // obj.name();
        // Smartphone obj1 = new Smartphone();//Allowed
        // obj1.name();
        
        //also allowed
        Phone obj = new Smartphone();//here reference of the Supperclass and the object is of subclass
        obj.showTime();
        obj.on();
        // obj.music(); Not allowed
        
        // Smartphone obj3 = new phone();//not allowed
        // //Subclass ka refrence is not allowed
        
        /*
       //objects creation is on run time after the statement
        class obj = new obj ();
        
        Superclass() has meth1() and meth2()
        and Subclass() has meth2() and meth3();(here meth2() is overridden)
        
        // Consider the scenerio 1
        //i.e. Superclass obj = new Subclass(); IS ALLOWED 
        //can use obj.meth2() is caled method of object i.e. of sun class will run
        //obj.meth3() Not allowed
        
        Subclass obj = new Superclass() --> NOT ALLOWED
        */
    }
}
class Phone{
    public void showTime(){
        System.out.println("Time is 8am ");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){//overridden
        System.out.println("turning on Smartphone");
    }
}