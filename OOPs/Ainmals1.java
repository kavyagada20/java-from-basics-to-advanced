/*object we have reated we created how can we can intilize
1.by methods
2.by using refrence(instance) variable
3. by using Constructor
*/

// //by using refrence(instance) variable
// class Animals {
//     String color;
//     int age;

//     public static void main(String[] args) {
//         Animals a = new Animals();
//         a.color="Black";
//         a.age=10;
//         System.out.println(a.color +" "+a.age);
//     }
// }

// by methods
class Animal1{
    String color;
    int age;
    
    void intObj(String c,int a){
        color=c;
        age=a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args) {
        Animals a = new Animals();
        a.intObj("Black",20);
        a.display();
    }
    
}