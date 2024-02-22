package practise;

public class PrintEvenOddNumber {
    static int n;
    int counter = 1;

    public static void main(String[] args) {
        n = 10;
        PrintEvenOddNumber mt = new PrintEvenOddNumber();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });
        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });
        // Start both threads
        t1.start();
        t2.start();

    }

    // Function to print odd numbers
    public void printOddNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < n) {
                // If count is even then print
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait(5);
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(counter + " ");

                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < n) {
                // If count is odd then print
                while (counter % 2 == 0) {
                    // Exception handle
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print(
                        counter + " ");
                // Increment counter
                counter++;
                // Notify to 2nd thread
                notify();
            }
        }
    }

}

