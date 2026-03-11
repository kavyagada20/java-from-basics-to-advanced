import java.lang.*; 
import java.util.Scanner; 
class SumOfArrayelements 
{ 
public static void main(String args[]) 
{ 
int number,a[],b[]; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Number of Elements(SIZE of Array) in array: "); 
number=sc.nextInt(); 
//Construct an array of above size 
a=new int[number]; 
b=new int[number]; 
//Input Elements in Array 
System.out.println("Enter "+number+" Elements in Array:"); 
for(int i=0;i<a.length;i++) 
{ 
System.out.print("Enter Element at a["+i+"]: "); 
a[i]=sc.nextInt(); 
} 
//logic to find sum of all elements in array except the index element 
int sum=0; 
for(int i=0;i<a.length;i++) 
{ 
sum=0; 
for(int j=0;j<a.length;j++) 
{ 
if(i!=j) //condition to exclude the index element from sum 
sum=sum+a[j]; 
} 
b[i]=sum; 
} 
System.out.print("Elements from Input Array:");
for(int i=0;i<a.length;i++) 
{ 
System.out.print(a[i]+" "); 
} 
System.out.println(); 
System.out.print("Elements from Output Array:"); 
for(int i=0;i<a.length;i++) 
{ 
System.out.print(b[i]+" "); 
} 
} 
} 
