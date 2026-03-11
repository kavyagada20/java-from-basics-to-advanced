/*
It is a program for need of Synchronization.
Schronization is a process in which we control the accessiblty of the multiple thread to a particular sherd resource.

Every object in java has:-
1.lock
2.It has 2 area (synchronized and non-synchronized)

(Here we have created 2 thread where there were 2 thread which was common to the class //BookTheaterSeat)

//synchronized block is used when we need to specific part of the code to synchriinize.It is time effiecient as it increases the waiting time period.Before and the the synchronized block both the thread runs together.
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
   

//1000 lines of code
		
	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());
	   

    int total_seats=10;
    void  bookSeat(int seats){
	synchronized(this){
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
//1000 line of code.
        	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());
	    System.out.println("hi:"+Thread.currentThread().getName());

    }
}