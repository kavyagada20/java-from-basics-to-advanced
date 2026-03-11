/*
USES OF THIS KEYWORD:-

 1."Super" Keyword can be used to refer immediate parent class instance variable.
 2."Super" Keyword can be used to invoke immediate parent class method.
 3.Super() can be used to invoke immediate parent class constructor.
 */
//1."Super" Keyword can be used to refer immediate parent class instance variable.
class A{
    int i=10;
}

class UsesOfSuperKeyword1 extends A {
    int i=20;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }
    public static void main(String[] args) {
        UsesOfSuperKeyword1 ob = new UsesOfSuperKeyword1();
        ob.show(32);
    }
}

