package Assignment;
import java.util.Scanner;

class NumberThread extends Thread {
    public void run(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("NumberThread: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AlphabetThread extends Thread {
    public void run(int n) {
        for (int i = 97; i < n + 97; i++) {
            System.out.println("AlphabetThread: " + (char)i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class AlphaNumThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ( 1 - 26 ): ");
        int n = sc.nextInt();

        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();
        
        alphabetThread.run(n);
        numberThread.run(n);
    }
}