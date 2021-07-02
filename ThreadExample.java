// Thread implements the Runnable Interface
public class ThreadExample implements Runnable {
    
    // Override the run() method of Runnable Interface
    @Override
    public void run(){
        System.out.println("Thread Number " + Thread.currentThread().getId() + " is running....");
    }
}