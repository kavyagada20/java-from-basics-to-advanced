import java.io.FileInputStream;

public class TryCatch {
    public static void main(String[] args) {
        int a=100,b=0,c;
        c=a/b;
        System.out.println(c);
        /*Whenever there is exception,the method in which exception occurrs will create an object (which is passed to the jvm and chexk whether can it or not,if it can it will pass the obj to the default Exception Handler which print the that exception and before going there jvm will abnormally terminate the program ) and that object will store three things:
        1.exception name 2.description 3.stack trace

        we dont want that our program will abnormally terminate so we will handle our exception manually.we cacn handle the exception using 5 keywords:1.try 2.catch 3.finally 4.throw 5.throws
        -->We will do it today see try and catch:

        Syntax of try and catch:

        try{
            //risky code in which exception can come
        }
        catch(ExceptionClassName ref.var.name){
        //handling code i.e. SOP(e);/SOP("The statement we need to provide.")
        }

    //1.exception name 2.description 3.stack trace get stored in the referncevariable 
    // we need to specify ExceptionClassName,if we doesnt know then we can too write Exception sinces it it the parent class of all Exception types

    */


    }
}
