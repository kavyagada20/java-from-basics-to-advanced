public class MethodIntro{	
    static int logic(int x,int y){//this method
    //Method is a fxn which is inside the class
        int z;
        if(x>y) z=x+y;
            else z=1;
         return z;
    }

//static method can call the static method only
//if ur method isnt staic then uhave creacte the object and call the method
//
//orelse it is ststic then we can directly call the method
    public static void main(String[] args) {
        int a=2;int b=3;int c;
        c=logic(a,b);
        System.out.println(c);
        int a1=2;int b1=0;int c1;
        c1=logic(a1,b1);
         System.out.println(c1);
      int  c2=logic(0,0); System.out.println(c2);
      //here copy is gone of this variables if we change the value of variable in methos then it doesnt change in main method when we print it out it would be come as before
       System.out.println(logic(5,3));
    }
}
     
  