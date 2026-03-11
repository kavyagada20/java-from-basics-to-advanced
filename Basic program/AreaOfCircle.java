import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of circle");
        double radius=sc.nextFloat();
        double area=3.14*radius*radius;
        System.out.println("the area of the circle is "+area);



    }
}
