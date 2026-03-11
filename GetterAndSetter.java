import java.util.Scanner;

public class GetterAndSetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        myEmployee harry=new myEmployee ();
        harry.setname("codewithharry");
        System.out.println(harry.getname());
    }
}
class myEmployee{
    private int id;
    private String name;
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
