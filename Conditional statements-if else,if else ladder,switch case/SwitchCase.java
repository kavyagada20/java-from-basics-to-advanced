import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner cd=new Scanner(System.in);
        int button=cd.nextInt();
        // if(button==1)
        // {
        //     System.out.println("hello");
        // }else if(button==2){
        //     System.out.println("Nmasate");
        // }else if(button==3){
        //     System.out.println("bonjour");
        // }else{
        //     System.out.println("Invalid button");
        // }
        switch (button) {
            case 1:
            System.out.println("hello");
                
               break;
            case 2:     System.out.println("namaste");           
               break;
            case 3:  System.out.println("bonjour");             
                break;       
            default: System.out.println("invalid no. ");                         
                break;
        }
    }
}
