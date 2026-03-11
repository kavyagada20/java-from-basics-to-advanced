import java.util.*; 
public class Pattern  
{ 
 public static void main(String[] args) 
{ 
int n; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Number of Rows in Pattern: "); 
n=sc.nextInt(); 
int[][] p = new int[n][]; 
for(int i=0;i<n;i++) 
p[i] = new int[i+1]; 
 //initializing array 
 for(int i=0; i < p.length; i++) 
{ 
 for(int j=0; j < p[i].length; j++) 
{ 
 p[i][j] = j+1; 
} 
 } 
  
 //printing Pattern Using Jagged Array 
 for(int i=0; i < p.length; i++) 
{ 
 for(int j=0; j < p[i].length; j++) 
{ 
 System.out.print(p[i][j]+" "); 
 } 
System.out.println(); 
} 
 } 
} 
