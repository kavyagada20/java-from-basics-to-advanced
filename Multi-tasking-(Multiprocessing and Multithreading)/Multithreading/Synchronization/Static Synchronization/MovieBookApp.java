//Need fore Static synchronization
class BookThreatreSeat{

    int total_seats=20;
     synchronized void bookSeat(int Seats){
            if(total_seats>=Seats){
            System.out.println(Seats+" Seats book Successfully");
            total_seats=total_seats-Seats;
            System.out.println("Seats left:"+total_seats);
        } else{
             System.out.println(Seats+" Seats cannot be booked.....!!!");
             System.out.println("Seats left: "+total_seats);
                
        }
    }
}

class MyTHread1 extends Thread{
    BookThreatreSeat b;
    int Seats;
    MyTHread1(BookThreatreSeat b,int Seats){
        this.b=b;
        this.Seats=Seats;
    }
    public void run(){
        b.bookSeat(Seats);
    }
}
class MyTHread2 extends Thread{
    BookThreatreSeat b;
    int Seats;
    MyTHread2(BookThreatreSeat b,int Seats){
        this.b=b;
        this.Seats=Seats;

    }
    public void run(){
        b.bookSeat(Seats);
    }
}

public class MovieBookApp {
    public static void main(String[] args) {
        BookThreatreSeat b1=new BookThreatreSeat();
        MyTHread1 t1=new MyTHread1(b1,7);
        t1.start();
        MyTHread2 t2=new MyTHread2(b1,6);
        t2.start();
        // BookThreatreSeat b2=new BookThreatreSeat();
        // MyTHread1 t3=new MyTHread1(b2,5);
        // t3.start();
        // MyTHread2 t4=new MyTHread2(b2,9);
        // t4.start();

        //Problem here can arisise is:interfernce between the threaad of different object means ;interfernces between (t1 & t2) & (t3 & t4).-->between 1)t1 and t3, 2).t1 and t4,3).t2 and t3 and 4). t2 and t4.
        //in simple sense what is happening is total_seats aas we create anew object.
    }
}
