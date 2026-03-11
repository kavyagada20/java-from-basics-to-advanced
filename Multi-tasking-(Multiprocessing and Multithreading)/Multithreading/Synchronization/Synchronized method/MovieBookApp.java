/*
It is a program for need of Synchronization.
Schronization is a process in which we control the accessiblty of the multiple thread to a particular sherd resource.

Every object in java has:-
1.lock
2.It has 2 area (synchronized and non-synchronized)

(Here we have created 2 thread where there were 2 thread which was common to the class //BookTheaterSeat)


*/
class MovieBookApp extends Thread {
    static BookTheaterSeat b;
    int seats;
    public void run(){
      b.bookSeat( seats);
    }
     public static void main(String args[]){
          b=new   BookTheaterSeat();
          MovieBookApp deepak=new MovieBookApp();
          deepak.seats=9;
          deepak.start();
          MovieBookApp amit=new MovieBookApp();
          amit.seats=6;
          amit.start();
        }
}

class BookTheaterSeat {
   
    int total_seats=10;
    synchronized void  bookSeat(int seats){
        if(total_seats>=seats){
            System.out.println(seats+" Seats book Successfully");
            total_seats=total_seats-seats;
            System.out.println("Seats left:"+total_seats);
        }
        else{
            System.out.println(seats+" Seats cannot be booked.....!!!");
            System.out.println("Seats left: "+total_seats);
            
        }
    }
}