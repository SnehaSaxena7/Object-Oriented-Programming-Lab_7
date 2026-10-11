/**
 * Q6: Thread.sleep().
 * Explanation: sleep(2000) pauses ONLY the thread that calls it (TIMED_WAITING).
 * The other thread keeps running normally, so its output appears while the
 * first thread is asleep. sleep() does not release any locks.
 */
public class Q06_ThreadSleep {
    public static void main(String[] args) {
        Thread sleeper = new Thread(() -> {
            System.out.println("Sleeper: going to sleep for 2 seconds...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sleeper: woke up!");
        });

        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker: continuing execution... step " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        sleeper.start();
        worker.start();
    }
}
