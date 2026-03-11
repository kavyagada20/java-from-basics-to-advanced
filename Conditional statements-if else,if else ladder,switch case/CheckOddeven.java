import java.util.Scanner;

public class CheckOddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.");
        int no=sc.nextInt();
        if(no%2==0)
        {
            System.out.println("the no. is even");
        }
        else{System.out.println("it's odd no.");
        }
    }
}
