
/*
Super keyword is a reference variable which refers the parent class object.,while this keyword is the refernce variable which reffers to the parent CLASS OBJECT
 */

class A{
    int a =10;
}
public class Super extends A{
    int a=20;  
    void show(int a){
        System.out.println(a);//1
        System.out.println(this.a);//20
        System.out.println(super.a);//12
    }  
    public static void main(String[] args) {
        Super ob1 = new Super();
        ob1.show(1);
    }
}