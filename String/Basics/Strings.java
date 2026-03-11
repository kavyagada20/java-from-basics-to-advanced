import java.util.Scanner;
class Strings {
    public static void main(String[] args) {
        //1stmethod
      String name= new String("harry kavya");
        //String name;name=new String("harry de");but are same
      System.out.println(name);
        //Srings are immutable
        //String is a class but can be used like a datatype
        //2nd method
       // String name="harry";
     //format specifiers
//  System.out.printf("the string is %c",name);//nut aabhi error arrah idk why
       //System.out.format("the string is %c",name);is same
       //taking input of the strings
       System.out.println("enter the Sentence");
       Scanner sc = new Scanner(System.in);
       String ab=sc.next();//it only take 1st word and just print lst word
System.out.println(ab);
//sc.nextLine();it would orint the enter input

    } 
}