import java.util.*;
abstract class Area{
abstract void calc(double dim1, double dim2);
void display(){
System.out.print("Area: ");
}
}
class Triangle extends Area{
double area;
void calc(double height, double base){
this.area = height*base/2;
}
void display(){
super.display();

System.out.print(area);
}
}
class Rectangle extends Area{
double area;
void calc(double length, double breadth){
this.area = length*breadth;
}
void display(){
super.display();
System.out.print(area);
}
}
class Circle extends Area{
double area;
void calc(double radius, double pi){
pi = 3.14159;
this.area = pi*radius*radius;
}
void display(){
super.display();
System.out.print(area);
}
}
class AbstractArea{ public static void
main(String[] agrs){ Scanner input = new
Scanner(System.in);

System.out.print("Enter base and height: ");
double base = input.nextDouble(); double
height = input.nextDouble();
Area a1 = new Triangle();
a1.calc(base, height);
a1.display();
System.out.print("\nEnter breadth and length: ");
double breadth = input.nextDouble(); double
length = input.nextDouble(); Area a2 = new
Rectangle(); a2.calc(breadth, length);
a2.display();
System.out.print("\nEnter radius: ");
double radius = input.nextDouble();
Area a3 = new Circle();
a3.calc(radius, radius);
a3.display();
input.close();
}
}
