import java.util.Scanner;

class Largest2{
public static void main(String args[]){
int a,b,c,largest;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
a=sc.nextInt();
System.out.println("Enter 2nd number: ");
b=sc.nextInt();
System.out.println("Enter 3rd number:");
c=sc.nextInt();

largest=(a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println("The largest is: "+largest);

}
}