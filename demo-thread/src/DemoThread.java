public class DemoThread {
    public static void main(String[] args) {

        // Approach 1 :Runnable (lambda) to implement Thread
        // Task logic
        Runnable printout = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("i=" + i);
            }
        }; // step 4

        // Task
        // Thread 1
        Thread thread = new Thread(printout); // Task Management

        System.out.println("start thread 1"); // step 1
        thread.run(); // step 2
        System.out.println("end thread 1"); // step 3

        // Thread 2
        Thread thread2 = new Thread(() -> System.out.println("hello World")); // Task Management
        System.out.println("start thread 2"); // step 1
        thread2.start(); // step 2
        System.out.println("end thread 2"); // step 3

        // Approach 2 : Create Printout Class implement Runnable

        // Approach 3 :Create PrintOut2 Class extends Thread
        Thread thread3 = new PrintOut2();
        thread3.start();

        try {
            thread.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {

        }
        System.out.println("Main Thread Ends");

    }

}
