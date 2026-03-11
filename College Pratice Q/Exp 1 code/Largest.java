import java.util.Scanner;

class Largest{
public static void main(String args[]){

int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
a=sc.nextInt();
System.out.println("Enter 2nd number:");
b=sc.nextInt();
System.out.println("Enter 3rd number:");
c=sc.nextInt();

if(a>b)
{
if(a>c)
System.out.println("The largest is: "+a);
else System.out.println("The largest is: "+c);
}

if(b>c)
System.out.println("The largest is: "+b);
else System.out.println("The largest is: "+c);

}
}