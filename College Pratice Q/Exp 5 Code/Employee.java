import java.util.Scanner;
 public class Employee { 
private String empid; private String empname;
 private String designation; 
private double salary;
 public void getEmployee() 
{ Scanner sc = new Scanner(System.in); 
System.out.println("Enter Employee ID: "); 
empid = sc.nextLine();
 System.out.println("Enter Employee Name: ");
 empname = sc.nextLine();
 System.out.println("Enter Employee Designation: ");
 designation = sc.nextLine(); 
System.out.println("Enter Employee Salary: "); 
salary = sc.nextDouble(); sc.close(); 
} public void showGrade() {
 char grade;
 if (salary >= 100000) {
 grade = 'A'; 
} else if (salary >= 50000) {
 grade = 'B'; 
} else { grade = 'C'; 
} 
System.out.println("Grade: " + grade); 
} 
public void showEmployee() {
 System.out.println("Employee Details:"); System.out.println("Employee ID: " + empid); System.out.println("Employee Name: " + empname); System.out.println("Designation: " + designation); System.out.println("Salary: " + salary); } 
public static void main(String[] args) {
 Employee employee = new Employee();
 employee.getEmployee();
 employee.showGrade(); 
employee.showEmployee(); 
}
 } 
