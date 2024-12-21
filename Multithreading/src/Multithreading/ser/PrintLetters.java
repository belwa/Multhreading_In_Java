package Multithreading.ser;


//Define another class that extends Thread to print letters
class PrintLetters extends Thread {
 @Override
 public void run() {
     // Print letters from A to E
     for (char letter = 'A'; letter <= 'Z'; letter++) {
         System.out.println(" Print the Letter is: " + letter);
         try {
             Thread.sleep(500); // Sleep for 500 milliseconds
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}
