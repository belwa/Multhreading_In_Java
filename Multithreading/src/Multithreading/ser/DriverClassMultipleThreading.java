package Multithreading.ser;

public class DriverClassMultipleThreading {
    public static void main(String[] args) {
        // Create instances of the threads
        PrintNumbers numbersThread = new PrintNumbers();
        PrintLetters lettersThread = new PrintLetters();

        // Start both threads
        numbersThread.start();
        lettersThread.start();
        
        // Optionally, wait for both threads to finish
        try {
            numbersThread.join();
            lettersThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}

