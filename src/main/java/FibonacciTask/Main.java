package FibonacciTask;

import java.util.Scanner;

public class Main {
     public static void fibonacciSequence(int numOftimes) {
         long startNum1 = 0;
         long startNum2 = 1;

         for (int i = 0; i < numOftimes; i++) {
             System.out.println((i + 1) + " = " + startNum1);
             long nextNum = startNum1 + startNum2;
             startNum2 = startNum1;
             startNum1 = nextNum;

         }
     }

    static void main() {
         Scanner input = new Scanner(System.in);

         while (true) {
             System.out.println("how many Fibonacci number would you like to see");
             String rawChoice = input.nextLine();
             int choice = Integer.parseInt(rawChoice);

             fibonacciSequence(choice);

             System.out.println("would you like to leave");
             String likeToLeave = input.nextLine();

             if (likeToLeave.equalsIgnoreCase("yes")) {
                 input.close();
                 break;
             }
         }
    }
}
