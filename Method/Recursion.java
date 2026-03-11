import java.util.Scanner;
public class Recursion{	
 //Calculating factorial using Recursion
    static int factorial(int n){
        //using factorial(n)=factorial(n-1)*n;
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        
     }
 //this can also done by iterative method
    public static void main(String[] args) {
   System.out.println("enter the no. u want to calculate factorial of");
   Scanner sc= new Scanner(System.in);
   int n =sc.nextInt();
   System.out.println("the factorial of "+n+" is "+factorial(n));
   
    }
}