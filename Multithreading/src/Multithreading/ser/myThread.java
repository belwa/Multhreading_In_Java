package Multithreading.ser;

class myThread extends Thread {
    // Override the run() method to define the task to be executed in the thread
    @Override
    public void run() {
        // Print the current thread's name
        System.out.println("Thread " + Thread.currentThread().getId() + " is executing.");
    }
}



		
	
	
	

