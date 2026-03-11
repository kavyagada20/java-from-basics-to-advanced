import java.util.Scanner;

public class sum {
    //take two variable a and b and print their sum
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the no.");
        int a=scanner.nextInt();
        System.out.print("enter the int");
        int b=scanner.nextInt();
        int sum=a+b;
        System.out.println("the sum is "+sum);
    }
}
