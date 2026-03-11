
/*
 * We can use the final method just 3 cases -in class,method and variable.
 for 
 *class-If we create the any class as final,we cannot extend it or inherit it.
 We can use the final method only when we want that don't want to inherit that class and extends it.

 *method-we cannot override the final method and we will get compile time error.

 *variables-If we create any variable final,it becomes constant,we cannot change it's value
 So,we can create the variables as the finalwhoes value we don't wwant to change,or not getting chsnge in the problem or nevers gets changes(likes the universal constants like pi,g etc)
 */

 final variable
public class A {
    public static void main(String[] args) {
        final int i =10;
        i=i+20;
        System.out.println(i);
// error: cannot assign a value to final variable i
i=i+20;
    }
}



