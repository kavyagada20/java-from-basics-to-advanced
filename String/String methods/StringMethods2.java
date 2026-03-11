public class StringMethods2{
 public static void main(String args[]){

 //Strings methods

String name="harry";

//substring(x);
System.out.println(name.substring(3));
System.out.println(name.substring(0));
//here name.substring(3) is ry ,if it was name.substring(0) it would print harry
//it means it will print given index in the substring till the last index of string
//call to substring is rebundant means that substring(0) means entire string thus for printing the entire string Sunstring is not necessary

System.out.println(name.substring(2,4));
//returns the string from the start and indes but start index is included and end index is not included

//.replace('r','p') it will return anew string after replacing r with p at all the occurences."happy" is returned in this case
System.out.println(name.replace('r','p'));

//.replace(""," ") replacing the String
System.out.println(name.replace("rry","ier"));//the output will be haier
System.out.println(name.replace("r","ier"));//the output will be haieriery

//.startsWith("String name")
System.out.println(name.startsWith("har"));//if starts with har it willl print true
System.out.println(name.startsWith("par"));//not starts with har so it will print false

//.endsWith("String name");
System.out.println(name.endsWith("rry"));//if ends with rry it willl print true
System.out.println(name.endsWith("par"));//not ends with par so it will print false

//.charAt(x) ; here x is valid integer within length of the string
//returns characters at the given index
System.out.println(name.charAt(4));//here it would be 'y'

//.index.Of(name); it returns the first index of the given string
System.out.println(name.indexOf("ry"));//basically it printing the index of r
System.out.println(name.indexOf("r"));//there are 2 'r',so it would print previous r i.ei the r will come first

//.indexOf("s",3); indexOf with starting chararcter ;(i.e. ignoring the before character and perform indexOf from that char)
System.out.println(name.indexOf("r",2));//since it starting with 2 and our word is "harry" ,so the 2nd char is 1st r ;so ans is 2
System.out.println(name.indexOf("r",3));//now its starting with 3 and our word is "harry" ,so the 1st r isnt in oicture;it detects 2nd r of //index no. 3 ;so ans is 3
//if it is not getting than it will return -1

//.lastIndexOf("r"); returns the last index of the given string;{here it searches from the back side}
String modiefiedName="Harryrry";
System.out.println(modiefiedName.lastIndexOf("rr"));
System.out.println(modiefiedName.lastIndexOf("rry"));
System.out.println(name.lastIndexOf("rr"));
System.out.println(name.lastIndexOf("rry"));

//.lastIndexOf("r",2) returns the last index of the given string after the given index 
System.out.println(modiefiedName.lastIndexOf("rr",4));
System.out.println(modiefiedName.lastIndexOf("rry",4));

//name.equals
System.out.println(name.equals("harry"));//if sting is equal it will print true
System.out.println(name.equals("barry"));// if string isnt equal it would pprint false

//equalsIgnoresCase()
System.out.println(name.equalsIgnoresCase("Harry"));//true
System.out.println(name.equalsIgnoresCase("HarRy"));//true

 }
}















