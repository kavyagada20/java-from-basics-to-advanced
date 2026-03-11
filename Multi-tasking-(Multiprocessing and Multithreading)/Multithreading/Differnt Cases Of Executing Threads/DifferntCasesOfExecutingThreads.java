/*
 1.Performing single task from the single thread.
 2.Performing single task from the multiple thread.
 3.Performing multiple task from the single thread.-->It is not possible
 .Eg.for VLC(videoplayer) which has video player,music,timer,etc as act thread which performs the task .BUt here all the function will be inside a single thread,so what will happen is of 2hrs of video 1st thread of music will will be executef for eg,after that of video will bwe excuted which takes another 2 hrs means all the proccess wont be done together within 2 hrs. 


 4.Performing multiple task from the multiple thread.
 */
public class DifferntCasesOfExecutingThreads {
    
       public static void main(String[] args) {
        //1
        Test1 t=new Test1 ();
        t.start();

        //2
        Test2 t1=new Test2 ();
        t1.start();
        Test2 t2=new Test2 ();
        t2.start();

        //4
        music a = new  music ();
        a.start();
        video b = new  video ();
        b.start();
        ProgressBar c = new  ProgressBar();
        c.start();
    }

}
// 1.Performing single task from the single thread.
class Test1 extends Thread {
    public void run(){
        System.out.println("THread Task");
    }
}
// 2.Performing single task from the multiple thread.
class Test2 extends Thread {
    public void run(){
        System.out.println("Task 1");
    }
}

//  4.Performing multiple task from the multiple thread. here we have done sample of vlc.
class music extends Thread {
    public void run(){
        System.out.println("Playing music");
    }
}
class video extends Thread {
    public void run(){
        System.out.println("playing video");
    }
}
class ProgressBar extends Thread {
    public void run(){
        System.out.println("Progress bar is executing");
    }
}