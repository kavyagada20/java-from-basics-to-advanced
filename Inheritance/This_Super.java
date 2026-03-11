class This_Super {
    public static void main(String[] args) {
    Ekclass e = new Ekclass(5);
    System.out.println(e.getA());
    }
}
class Ekclass{
    int a;
    Ekclass(int a){
    //   a=v; 
       this.a=a;
    } 
    public int getA(){
        return a;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
         super (c);
        System.out.println("me ek constructor huh");
    } 
}
