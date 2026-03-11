 import java.util.*;
 class power { 
public static int power(int x, int n) {
 if(n==0) { 
return 1; 
}
 else if(n>0) {
 return x*power(x,n-1); 
      	} 
else { return 1/ power(x,-n); 
} 
} 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); System.out.println("Enter the base: "); 
int x=sc.nextInt();
 System.out.println("Enter the power: ");
 int n=sc.nextInt();
 System.out.println(power(x,n)); 
} 
} 
