
import java.util.Scanner;

public class Compare2nos {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
    //     if(a==b)
    //     {
    //         System.out.println("Equal");
    //     }
    //   else
    //   {
    //     if (a>b) {
    //       System.out.println(a+" is greater");  
    //     }
    //     else{
    //         System.out.println(b+" is greater");
    //     }
    //   }
    //solving using else if statement
        if(a==b)
        {
            System.out.println("equal  ");
        }
        else if(a>b)
        {
            System.out.println(a+" is greater");
        }
        else
        {
            System.out.println(b+" is greater");
        }

//"else if ladder" is terminated fot the last condition by else
    }
}
