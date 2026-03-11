import java.util.*;
public class InvertedHalfPyramid_WithNum{
 public static void main(String args[]){
int n=4;
//outer loop
for(int i=n;i>=1;i--){

for(int j=1;j<=i;j++){
System.out.print(j+" ");
}

System.out.print("\n");
}

 }
}