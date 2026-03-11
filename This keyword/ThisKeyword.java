//this keyword is also a eference variable that refers to the current object.

 class Test {
    int i;
    void setValues(int i){
        this.i=i;//this keyword refers to the current class instance variable.
    }
    // void setValues(int x){
    //     i=x;
    // }
    void show(){
        System.out.println(i);
    }
}

class ThisKeyword{
    public static void main(String[] args) {
        Test t = new Test();
        t.setValues(10);
        t.show();
    }
}