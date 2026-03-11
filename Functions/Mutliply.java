import java.util.*;
public class Mutliply{
public static int multiply(int a,int b){
int sum=a*b;
return sum;

}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 integers");

int a=sc.nextInt();
int b=sc.nextInt();
int sum=multiply(a,b);
System.out.println("the product of 2 num is"+ sum);
 }
}
