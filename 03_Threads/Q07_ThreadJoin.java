/**
 * Q7: join() - main (or any thread) waits for another thread to finish.
 */
public class Q07_ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1: working... " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread-1: finished.");
        });

        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Thread-2: waiting for Thread-1 to finish...");
                t1.join();   // Thread-2 waits here until t1 terminates
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread-2: Thread-1 is done, now I can run.");
        });

        t1.start();
        t2.start();
    }
}
