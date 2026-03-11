import java.util.Scanner;
class Calculator{ 
public static void main(String args[]){
 float a, b, result;
int choice;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number:");
a=sc.nextFloat();
System.out.println("Enter 2nd number:");
b=sc.nextFloat();
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5. Remainder");
System.out.println("Enter choice:");
choice=sc.nextInt();

switch(choice)
{
case 1:result=a+b;
System.out.println("Result:"+result);
break;
case 2:result=a-b;
System.out.println("Result:"+result);
break;
case 3:result=a*b;
System.out.println("Result:"+result);
break;
case 4:result=a/b;
System.out.println("Result:"+result);
break;
case 5:result=a%b;
System.out.println("Result:"+result);
break;
default:System.out.println("INVALID");
}

}
}