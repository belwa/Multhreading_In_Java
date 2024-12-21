package Multithreading.ser;

public class DriverClass1 {
    public static void main(String[] args) {
        // Create two thread instances
        myThread thread1 = new myThread();
        myThread thread2 = new myThread();

        // Start both threads
        thread1.start();
        thread2.start();
        
   
  // join()- join() method is used to make the main thread wait until the thread(thread1 , therad2)
        // finish their execaution
        
       try
       {
    	  thread1.join(); 
    	  thread2.join();
       } catch(InterruptedException e) {
    	   e.printStackTrace();
       }
       System.out.println("Main thread execaution finished");
        

}
    
}