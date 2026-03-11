//1.SingleInheritance
class SingleInheritance extends A{
    void showB(){
        System.out.println("class B method");
    }
    public static void main(String[] args){
        A a = new A();
        a.showA();
       // a.ShowB();
       SingleInheritance abc = new SingleInheritance();
       abc.showA();
       abc.showB();
        
    }
}
class A{
    void showA(){
        System.out.println("class A method");
    }
}