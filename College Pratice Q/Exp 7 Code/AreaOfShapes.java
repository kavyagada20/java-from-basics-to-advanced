//b. WAP to display area of square and rectangle using the concept of overloaded constructor (use  parameterized, non-parameterized and copy constructor). 

public class AreaOfShapes  
{  
int side,len,breadth;  
double area; 
//constructor of the class  
public AreaOfShapes () // Default Constructor  
{  
}  
public AreaOfShapes(int l,int b) // paramaterized Constructor  
{  
len=l; 
breadth=b; 
}  
public AreaOfShapes(AreaOfShapes co) //Copy Constructor 
{  
side=co.len;  
}  
public double areaOfSquare() 
{ 
return Math.pow(side,2); 
} 
public double areaOfRect() 
{ 
return len*breadth; 
} 
public static void main(String args[])  
{  
//creating objects  
AreaOfShapes ob1 = new AreaOfShapes();  
AreaOfShapes ob2 = new AreaOfShapes(10,12);  
AreaOfShapes ob3 = new AreaOfShapes(ob2);  
System.out.println("Area of Square="+ ob3.areaOfSquare()); 
System.out.println("Area of Rectangle="+ ob2.areaOfRect()); 
  
}  
} 
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 6>javac  AreaOfShapes.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 6>java AreaOfShapes Area of Square=100.0 
Area of Rectangle=120.0 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 6> */ 
