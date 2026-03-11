//A program for need of Synchronization.
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
    void  bookSeat(int seats){
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
