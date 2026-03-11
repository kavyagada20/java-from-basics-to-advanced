public class StringMethods{
 public static void main(String args[]){

 //Strings methods

String a="harry";//index Starts with 0
// another way String a1=new String("Harry");
System.out.println(a);

int value=a.length();//its the fxn used to print the length of the string
System.out.println("the length of the string is "+ value);

String lower=a.toLowerCase();//converts the string into lower case 
System.out.println("the conversion the string into lower case is as follows: " +lower);

//Similarly there is a.toUpperCase()
System.out.println("the conversion the string into lower case is as follows: " + a.toUpperCase() );

//.trim(); this is used to remove spaces
String nonTrimmedstring="   Harry  ";
System.out.println(nonTrimmedstring);
System.out.println(nonTrimmedstring.trim() );



 }
}