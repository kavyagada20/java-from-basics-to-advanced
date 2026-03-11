//b. Display data of the specialized classes given in the following class diagram. Code: 

import java.util.*; 
class Staff 
{ 
String code; 
String name; 
Staff(String c,String n) 
{ 
code=c; 
name=n; 
} 
} 
class Teacher extends Staff 
{ 
Teacher() 
{ 
super("DJ:707","Prof. Sudhir"); 
} 
String sub; 
int exp; 
public void read() 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Teacher Subject and Experience:"); 
sub=sc.next(); 
exp=sc.nextInt(); 
} 
public void display() 
{
System.out.println("**Teacher Information**"); 
System.out.println("Code: "+code); 
System.out.println("Name: "+name); 
System.out.println("Teacher Subject: "+sub); 
System.out.println("Teacher Experience: "+exp); 
} 
} 
class Typist extends Staff 
{ 
int speed,exp; 
Typist(int speed,int exp,String code, String name) 
{ 
super(code,name); 
this.speed=speed; 
this.exp=exp; 
} 
} 
class Regular extends Typist 
{ 
int sal; 
Scanner sc=new Scanner(System.in); 
Regular(int speed,int exp,String code, String name) 
{ 
super(speed,exp,code,name); 
} 
public void read() 
{ 
System.out.println("Enter salary of Regular Typist:"); 
sal=sc.nextInt(); 
} 
public void display() 
{ 
System.out.println("**Regular Typist Information**"); System.out.println("Code: "+code); 
System.out.println("Name: "+name); 
System.out.println("Typing Speed: "+speed); 
System.out.println("Experienc: "+exp); 
System.out.println("Salary: "+sal); 
} 
} 
class Casual extends Typist 
{ 
int sal; 
Scanner sc=new Scanner(System.in); 
Casual(int speed,int exp,String code, String name) 
{
super(speed,exp,code,name); 
} 
public void read() 
{ 
System.out.println("Enter salary of Casual Typist:"); 
sal=sc.nextInt(); 
} 
public void display() 
{ 
System.out.println("**Casual Typist Information**"); System.out.println("Code: "+code); 
System.out.println("Name: "+name); 
System.out.println("Typing Speed: "+speed); 
System.out.println("Experienc: "+exp); 
System.out.println("Salary: "+sal); 
} 
} 
class Officer extends Staff 
{ 
String dept, grade; 
Scanner sc=new Scanner(System.in); 
Officer() 
{ 
super("DJ:808","Dr. Nilesh"); 
} 
public void read() 
{ 
System.out.println("Enter Officer Dept: "); 
dept=sc.next(); 
System.out.println(); 
System.out.println("Enter Officer Grade: "); 
grade=sc.next(); 
} 
public void display() 
{ 
System.out.println("**Offcier Information**"); 
System.out.println("Code: "+code); 
System.out.println("Name: "+name); 
System.out.println("Offcier Department: "+dept); 
System.out.println("Offcer Grade: "+grade); 
} 
} 
class Administration 
{ 
public static void main(String args[]) 
{ 
Teacher t=new Teacher();
t.read(); 
t.display(); 
Officer o=new Officer(); 
o.read(); 
o.display(); 
Regular r=new Regular(30,10,"DJ:505","Mr.Subhash"); 
r.read(); 
r.display(); 
Casual c=new Casual(25,5,"DJ:404","Mr.Rahul"); 
c.read(); 
c.display(); 
} 
} 

/* 
OUTPUT: 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 7>javac  Administration.java 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 7>java Administration Enter Teacher Subject and Experience: 
Java 
15 
**Teacher Information** 
Code: DJ:707 
Name: Prof. Sudhir 
Teacher Subject: Java 
Teacher Experience: 15 
Enter Officer Dept: 
Admin 
Enter Officer Grade: 
Class-1 
**Offcier Information** 
Code: DJ:808 
Name: Dr. Nilesh 
Offcier Department: Admin 
Offcer Grade: Class-1 
Enter salary of Regular Typist:25000 
**Regular Typist Information** 
Code: DJ:505 
Name: Mr.Subhash 
Typing Speed: 30 
Experienc: 10 
Salary: 25000 
Enter salary of Casual Typist:20000 
**Casual Typist Information** 
Code: DJ:404 
Name: Mr.Rahul 
Typing Speed: 25 
Experienc: 5 
Salary: 20000 
*/
