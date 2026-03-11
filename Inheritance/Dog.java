/*
iheritaance:Inheriting the properities of parent class into child class
-In technical terms inheritance is the procedure by which one object acquires all the properties and behaviour of the parent class. 
*/
class Dog extends Animals//Dog is a child class/Sub class
{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
    }
}
class Animals//Parent class/superclass
{
    void eat(){
        System.out.println("i am eating");
    }
}
//Dog(child) IS-A animal(parent class) -->IS-A Relationship

