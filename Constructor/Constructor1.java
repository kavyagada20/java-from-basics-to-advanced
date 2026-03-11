import java.util.Scanner;

public class Constructor1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        myEmployee harry=new myEmployee ();
      //  harry.setname("codewithharry");
        System.out.println(harry.getname());
        
    }
}
class myEmployee{
    //instance variables
    private int id;
    private String name;
    //constructors:it A method class name and without a return type
    //it's name ia sME OF THAT OF CLASS
    //WHEN WE are declariing the object myEmployee harry=new myEmployee ();
    //second one is instance variable and it does get automatically invocated
     public myEmployee(){
           id=45;
           name="Your";
       }
       
       //getter and setter
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getid(){
        return id;
    }
    public void setname(int id){
        this.id=id;
    }
}
