class SyncCounter {
    private int count = 0;

    // synchronized -> only one thread can execute this method at a time
    synchronized void increment() {
        int temp = count;     // same read-modify-write as Q8 (with yield) ...
        Thread.yield();
        count = temp + 1;     // ... but now it is safe because the method is synchronized
    }

    int getCount() {
        return count;
    }
}

/** Q9: Same program as Q8, fixed using a synchronized method. */
public class Q09_Synchronization {
    public static void main(String[] args) throws InterruptedException {
        final int THREADS = 10;
        final int INCREMENTS = 1000;
        SyncCounter counter = new SyncCounter();
        Thread[] threads = new Thread[THREADS];

        for (int i = 0; i < THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Expected count : " + (THREADS * INCREMENTS));
        System.out.println("Actual count   : " + counter.getCount() + "  (always correct with synchronization)");
    }
}
