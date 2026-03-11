
/*
Common misconception:Compiletime exceptions occurs at the compiletime and run time exceptions occurs at runtime.
Actually:- All the execption occurs at the runtime.
 */

import java.io.FileInputStream;//predefine class
public class CompiletimeVsRuntimeExecption {
    public static void main (String[] args) {
    //     // FileInputStream fis = new FileInputStream("d:abc.txt");//use to read the data
    //     // unreported exception FileNotFoundException; must be caught or declared to be thrown;                                    it doesnt mean file does not exist just we saying to report it

    //     try {
    //         FileInputStream fis = new FileInputStream("d:abc.txt");
    //     } catch (Exception e) {
    //         System.out.println(e);// CompiletimeVsRuntimeExecption
    //     }
    // 
   // Class.forName("com.mysql.jdbc.Driver");//unreported exception ClassNotFoundException; must be caught or declared to be thrown
   //Compiletime is just telling that there might be problem in ahead future,it was here just a precaution whether we wont get the file;but the actual execption comes at the runtime i.e. when it doesnt get the file.

   try {
    Class.forName("com.mysql.jdbc.Driver");
   } catch (Exception e) {
        System.out.println(e);//java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
   }

//    int a=10,b=0,c;
//    c=a/b;
//    System.out.println(c);//Exception in thread "main" java.lang.ArithmeticException: / by zero
//    //it runtime exception COmpiler is not able to dtect it.we dont need try catch things here ;basically there was no need to report 

String name=null;
System.out.println(name.length());
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null (runtime exception)

    }
}