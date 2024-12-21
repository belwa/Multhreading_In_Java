package Multithreading.ser;


class MyRunnable implements Runnable {
    String threadName;
    
    // Constructor to initialize the threadName
    MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(threadName + " count: " + i);
            
            try {
                // simulate some work by sleeping for a short tim
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // create the instances of MyRunnable
        MyRunnable task1 = new MyRunnable("Thread 1");
        MyRunnable task2 = new MyRunnable("Thread 2");
        MyRunnable task3 = new MyRunnable("Thread 3");
        MyRunnable task4 = new MyRunnable("Thread 4");
        MyRunnable task5 = new MyRunnable("Thread 5");
        
        // create the threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
        Thread thread5 = new Thread(task5);
        
        // start all the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        
        // wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
