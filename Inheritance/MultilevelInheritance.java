//1.MultilevelInheritance
class Main{
    public static void main(String[] args){
        A a =new A ();
        a.showA();
        // a.showB();
        // a.showC();
        
        B b = new B();
        b.showA();
        b.showB();
        //b.showC();
        
        C c =new C();
        c.showA();
        c.showB();
        c.showC();
        
    }
}
class C extends B{
    void showC(){
        System.out.println("class C  method");
    }
    
}
class B extends A{
    void showB(){
        System.out.println("class B method");
    }
   
}
class A{
    void showA(){
        System.out.println("class A method");
    }
}