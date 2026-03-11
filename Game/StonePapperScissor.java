import java.util.Scanner;
import java.util.Random;

public class StonePapperScissor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper and 2 for scissor");
        int userInput=sc.nextInt();
        
        Random random=new Random();
        int computerInput=random.nextInt(3);
        
        if(userInput==computerInput){
            System.out.println("Draw");
        } else if (userInput==0 && computerInput==1 || userInput==1 && computerInput==2 || userInput==2 && computerInput==0 ){
                System.out.println("Computer Win!");
            }else 
            {
                System.out.println("you wins");
            }
            System.out.println("Computer choice:"+computerInput);
    }
}