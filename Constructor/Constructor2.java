import java.util.Scanner;

public class Constructor2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        myEmployee harry= new myEmployee ("hharry",12);
      //harry.setname("codewithharry");
      //methog get priority ober constructor
        System.out.println(harry.getname());
        System.out.println(harry.getid());
        
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
    
    //  public myEmployee(){
    //       id=45;
    //       name="Your";
    //   }
     public myEmployee(String name,int id){
           this.name=name;
           this.id=id;
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
