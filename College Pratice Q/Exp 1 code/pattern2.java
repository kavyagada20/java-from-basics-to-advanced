import java.util.Scanner;
 public class Pattern2 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int i, j, num, k, count, temp = 65, alpha, temp1 = 1;
 System.out.println("Enter number of rows");
 num =scanner.nextInt();
 count = num- 1;
 for (i = 1; i <= num; i++) {
 for (k = 1; k <= count; k++) {
 System.out.print(" ");
 }
 alpha = temp;
 for (j = 1; j <= i; j++) {
 System.out.print((char) alpha);
 alpha--;
 }
 temp = temp + (++temp1);
 System.out.println();
 count--;
 }
 scanner.close();
 }
 }
