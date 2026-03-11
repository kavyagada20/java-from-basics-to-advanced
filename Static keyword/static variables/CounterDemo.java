//Static variable gets memory allocated only onces in the class area at the time of class loading.
class CounterDemo{
    static int count=0;
    CounterDemo(){
        count++;
        
    }
    public static void main(String[] args) {
        CounterDemo c1= new CounterDemo();
        CounterDemo c2= new CounterDemo();
        CounterDemo c3= new CounterDemo();
        CounterDemo c4= new CounterDemo();
        CounterDemo c5= new CounterDemo();
        System.out.println("The no. of the objects :"+count);
    }
    
}