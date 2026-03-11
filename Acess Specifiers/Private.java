import java.util.Scanner;

 class Private{
    public static void main(String[] args) {
      MyEmployee player1=new MyEmployee();
      //Scanner sc=new Scanner(System.in);
    //  player1.id=21;
    //  player1.name="kavya";
   // it throughs an error because of the private access modifiers
   player1.setName("hehe");
   System.out.println(player1.getName());
    }
}
                
class MyEmployee{
    private int id;
    private String name;
    ///they cannot be accesed aasia he;but by using the method they can be accessed
    public void setName(String n){
         name=n;
    }
    public String getName(){
         return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
