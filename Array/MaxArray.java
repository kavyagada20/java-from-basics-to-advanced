public class MaxArray
{
	public static void main(String[] args) {
     int [] arr={1,2,-912,3,-4,5,23,-233,-2147483647,2147483647};
    // int max=0;//we had assigned the value of max as 0;since it was min value in arrray;it 1 has problem if the min element or max element we are assigning to the variable;usse small ya big value array woh then it would nt be appropriate code
    //so there are 2 ways
   int max= Integer.MIN_VALUE;
     for(int e:arr){
         if(e>=max){
             max=e;
         }
     }
     int min=Integer.MAX_VALUE;
     for(int e:arr){
         if(e<=min){
             min=e;
         }
     }
     System.out.println("the value of the max element in this arrayis:"+max);
     System.out.println("the value of the min element in this arrayis:"+min);
     System.out.println(Integer.MAX_VALUE);
     System.out.println(Integer.MIN_VALUE);

 
	}
}
