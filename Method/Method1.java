public class Method1{	
    static void telljoke(int x,int y){
       System.out.println("What month is the shortest of the year? May, it only has three letters."); 
    }
    static void change( int a){
        a=98;
    }
    static void change2( int [] arr){
        arr[0]=98;//here we are passing the refrence of the object
    }
    

    public static void main(String[] args) {
     //telljoke();
     
     //case 1:changing the integer
    //  int x=45;
    //  change(x);
    //  System.out.println("the value of marks after running the change method is "+ x);
     //the value of the integer hasnt changed 
     
     //case2 :changing the array
    int []marks={45,34,44,12};//array object is formed when we write int [] and marks is here refrence which is storing the address
    change2(marks);
    System.out.println("the value of marks after running the change method is "+ marks[0]);
    //it had changed the value of the array
    
     
    }
}