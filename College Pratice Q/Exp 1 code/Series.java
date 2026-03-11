import java.util.Scanner;
 public class Series {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the value of n: ");
 int n = scanner.nextInt();
 double sum = 0;
 for (int i = 1; i <= n; i++) {
 double term = 1.0 / (i * i);
 sum += term;
 }
 System.out.printf("The sum of the series is: %.3f\n", sum);
 scanner.close();
 }
 }