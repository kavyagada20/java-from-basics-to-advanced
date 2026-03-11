import java.util.*; 
class Student 
{ 
int IdNo,phy,chem,maths,n,total; 
String name; 
public Student(int id,String n,int m,int p,int c,int t) 
{ 
IdNo=id; 
name=n; 
maths=m; 
phy=p; 
chem=c; 
total=t; 
}  
public static void main(String args[]) 
{ 
int IdNo,phy,chem,maths,n,total; 
String name; 
Student s[]; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter number of Students:"); 
n=sc.nextInt(); 
s=new Student[n]; //to constuct array of objects to store record of n students System.out.println("Enter Records of "+n+" student");
for(int i=0;i<s.length;i++) 
{ 
System.out.println("Enter Record of "+(i+1)+" Student:"); 
System.out.println("Enter ID Number of Student: "); 
IdNo=sc.nextInt(); 
System.out.println("Enter name of Student: "); 
name=sc.next(); 
System.out.println("Enter Marks of (Maths, Physics,Chemestry): "); 
maths=sc.nextInt(); 
phy=sc.nextInt(); 
chem=sc.nextInt(); 
total=phy+chem+maths; 
s[i]=new Student(IdNo,name,maths,phy,chem,total); 
} 
System.out.println("Recod of the Students as per Decending order of total marks: "); 
for(int i=0;i<s.length-1;i++) //number of passes 
{ 
for(int j=0;j<s.length-1-i;j++) //number of adjustant record comparison 
{ 
if(s[j].total < s[j+1].total) //if condition is true swap 1 record with  
another record 
{ 
Student temp; 
temp=s[j]; 
s[j]=s[j+1]; 
s[j+1]=temp; 
} 
} 
} 
// to display record 
System.out.println("ID Number\tName\tMaths\tPhysics\tChemestry\tTotalMarks"); 
for(int i=0;i<s.length;i++) 
{ 
System.out.print(s[i].IdNo+"\t "+s[i].name+"\t "+s[i].maths+"\t  
"+s[i].phy+"\t "+s[i].chem+"\t\t "+s[i].total); 
System.out.println(); 
} 
} 
}
7
/* 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5>java Student Enter number of Students: 
3 
Enter Records of 3 student 
Enter Record of 1Student: 
Enter ID Number of Student: 
101 
Enter name of Student: 
Sudhir 
Enter Marks of (Maths, Physics,Chemestry): 
66 77 88 
Enter Record of 2Student: 
Enter ID Number of Student: 
102 
Enter name of Student: 
Nilesh 
Enter Marks of (Maths, Physics,Chemestry): 
88 77 55 
Enter Record of 3Student: 
Enter ID Number of Student: 
103 
Enter name of Student: 
Komal 
Enter Marks of (Maths, Physics,Chemestry): 
99 88 77 
Recod of the Students as per Decending order of total marks: 
ID Number Name Maths Physics Chemestry TotalMarks 
103 Komal 99 88 77 264 
101 Sudhir 66 77 88 231 
102 Nilesh 88 77 55 220 
D:\Sudhir\A.Y. 2022-23 EVEN SEM\JAVA_FE\Java Programs\Experiment No 5> */
