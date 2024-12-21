package Multithreading.ser;

//Define a class that extends Thread to print numbers
class PrintNumbers extends Thread {
 @Override
 public void run() {
     // Print numbers from 1 to 5
     for (int i = 1; i <= 26; i++) {
         System.out.println(" ptint the number is Number: " + i);
         try {
             Thread.sleep(500); // Sleep for 500 milliseconds
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}
	

