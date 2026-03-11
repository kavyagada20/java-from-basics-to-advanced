import java.lang.*; 
import java.util.Scanner;
class AnnualExamResult 
{ 
public static void main(String args[]) 
{ 
int number,std[][],max[],total=0,j; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Number of Students: "); 
number=sc.nextInt(); 
//Construct an array of above size 
std=new int[number][5]; 
max=new int[5]; 
//Input Elements in Array 
System.out.println("Enter "+number+" Student Exam record:"); 
for(int i=0;i<std.length;i++) 
{ 
total=0; 
System.out.print("Enter Student "+(i+1)+" Roll No & Marks of 3 Subjects: "); 
for(j=0;j<4;j++) 
{ 
std[i][j]=sc.nextInt(); 
if(j!=0) 
total=total+std[i][j]; 
} 
std[i][j]=total; 
max[i]=total; 
} 
System.out.println(); 
//Student Record 
System.out.println("RollNo \tSubject1\tSubject2\tSubject3\t TotalMarks"); 
for(int i=0;i<std.length;i++) 
{ 
for(j=0;j<5;j++) 
{ 
System.out.print(std[i][j]+"\t\t"); 
} 
System.out.println(); 
} 
//Logic to find Maximum marks obtained by the student 
int maxMarks=0,r=0; 
for(int i=0;i<max.length;i++) 
{ 
if(max[i]>maxMarks) 
{ 
maxMarks=max[i]; 
r=i; //recording roll number of student who has got maximum marks
} 
} 
System.out.println("Record of student who have Maximum Marks: ");
System.out.println("RollNo \tSubject1\tSubject2\tSubject3\t TotalMarks"); 
for(j=0;j<5;j++) 
{ 
System.out.print(std[r][j]+"\t\t"); 
} 
} 
} 
