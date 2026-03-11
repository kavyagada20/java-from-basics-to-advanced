public class VaragsHarry{	
    // static int sum(int a,int b){
    //   return a+b;
    // }
    // static int sum(int a,int b,int c){
    //   return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //   return a+b+c+d;
    // }
        //but this much overloading wasnt needed,we must use variable arguments i.e. varags
        
   // static int sum(int ...arr){
       //available as int [] arr;
       //in these no. of arguments can be zero;there can be caase in which we doesnt pass any argument;so if we need atleast 1 argument then we can declare the method as follows
       static int sum(int x,int ...arr){
           //in this case no arguments wont works we must give some arguments atleast 1
      int result=0;
       for(int a:arr){
           result+=a;
       }
       return result;
    }
   
    
    public static void main(String[] args) {
    System.out.println("The of the 4 and 5 is "+sum(4,5));
    System.out.println("The of the 3,4 and 5 is "+sum(3,4,5));
    System.out.println("The of the 2,3,4 and 5 is "+sum(2,3,4,5));
  //  System.out.println("The of the nothing is "+sum());//sum of nothing means sum of empty array is 0.

    }
}