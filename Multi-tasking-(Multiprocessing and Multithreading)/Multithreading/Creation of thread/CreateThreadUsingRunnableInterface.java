//Step 1:Implents the runnable interface
class CreateThreadUsingRunnableInterface implements Runnable{
    //Step 2:Override the run() method
    public void run(){
       System.out.println("Thread Task");
    }
  

    //Masti(explore) overloading ki just checking what happens
   //  public void run(int a){
   //     System.out.println("Thread Task");
   //  }
    public static void main(String[] args) {
       //Step 3:create an object of thread class and pass the parameter in constructor of Thread class.
       CreateThreadUsingRunnableInterface t1 = new CreateThreadUsingRunnableInterface();
       Thread th = new Thread(t1); 
       th.start();//Step 4:start the thread
    }
 
 }
 //It is better method,it promotes mutliple inheritance as a threadand improves the the performances.