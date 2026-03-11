import java.util.Scanner;
public class FibonacciInComplete{	
 
    static void fibonacci(int n){
       
    int a=0,b=1;int c;
    System.out.print("0 1 ");
    while(a<=n ){
       c=a+b;
       System.out.print(c+" ");
       int temp=b;
       b=c;
       c=temp;
       n++;
    }
    return;
     }
    public static void main(String[] args) {
   System.out.println("enter the no. of terms of fibonacci series to be printed(no. of terms should be in int) ");
   Scanner sc= new Scanner(System.in);
   int n =sc.nextInt();
   System.out.println("the Fibonacci series of "+ n +" is );
   fibonacci(int n);
    }
}