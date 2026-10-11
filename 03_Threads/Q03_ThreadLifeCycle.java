/**
 * Q3: Thread life cycle.
 *
 * NEW           -> thread object created, start() not yet called
 * RUNNABLE      -> start() called; ready to run / running (Java has one RUNNABLE
 *                  state covering both "Runnable" and "Running")
 * BLOCKED       -> waiting to acquire a monitor lock held by another thread
 * TIMED_WAITING -> waiting for a fixed time (sleep) - the "Waiting" state
 * TERMINATED    -> run() has finished
 */
public class Q03_ThreadLifeCycle {
    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("[Worker] Inside run(), state = " + Thread.currentThread().getState()); // RUNNABLE
            synchronized (lock) {
                try {
                    Thread.sleep(500);   // TIMED_WAITING
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("1. After creation  : " + worker.getState());   // NEW

        synchronized (lock) {            // main holds the lock
            worker.start();
            Thread.sleep(100);           // give worker time to try the lock
            System.out.println("2. Lock held by main: " + worker.getState());   // BLOCKED
        }

        Thread.sleep(200);               // worker now holds lock and is sleeping
        System.out.println("3. While sleeping  : " + worker.getState());        // TIMED_WAITING

        worker.join();
        System.out.println("4. After finishing : " + worker.getState());        // TERMINATED
    }
}
