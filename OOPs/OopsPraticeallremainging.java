// Online Java Compiler
// Use this editor to write, compile and run your Java code online
        //Problem 2
//  class OopsPraticeallremainging {
//     public static void main(String[] args) {
//       Cellphone vivo=new Cellphone();
//       vivo.ringing();
//       vivo.vibrating();
//       vivo.callfreind();
//         System.out.println(  );
//     }
// }

// class Cellphone{
//     String name;
//     int salary;
    
//     public void ringing(){
//         System.out.println("Ringing");
//     }
//     public void vibrating(){
//         System.out.println("Vibrating");
//     }
//     public void callfreind(){
//         System.out.println("caller tune");
//     }
// }

//probem 3
import java.util.Scanner;
//  class OopsPraticeallremainging {
//     public static void main(String[] args) {
//       Square sq=new Square();
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the side of the sqaure");
//       sq.side=sc.nextInt();
//       System.out.println("The area of the Square is " + sq.area());
//       System.out.println("The Perimeter of the Square is "+sq.perimeter());
//     }
// }

// class Square{
//     int side;
    
//     public int area(){
//         return side*side;
//     }
//     public int perimeter(){
//         return side*4;
//     }
 
//     }

//Problem 4
 class OopsPraticeallremainging {
    public static void main(String[] args) {
      Tommy player1=new Tommy();
      //Scanner sc=new Scanner(System.in);
    player1.hit();
    player1.running();
    player1.firing();
    
    }
}

class Tommy{
    int side;
    
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void running(){
System.out.println("running the enemy"); 
}
    public void firing(){
System.out.println("firing the enemy"); 
}
    }
