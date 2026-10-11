class Counter {
    int count = 0;

    void increment() {
        // count++ is NOT atomic (read -> add -> write). Thread.yield() is added only
        // to make the thread switch likely so the race shows up reliably in a demo.
        int temp = count;
        Thread.yield();
        count = temp + 1;
    }
}

/**
 * Q8: Shared counter WITHOUT synchronization.
 * Expected = 10 threads x 1000 = 10000, but the actual result is usually
 * less because of a race condition (threads overwrite each other's updates).
 * Note: the exact wrong value changes on every run (and on a very fast machine
 * it may occasionally come out correct by luck - just run it again).
 */
public class Q08_RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        final int THREADS = 10;
        final int INCREMENTS = 1000;
        Counter counter = new Counter();
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

        int expected = THREADS * INCREMENTS;
        System.out.println("Expected count : " + expected);
        System.out.println("Actual count   : " + counter.count);
        if (counter.count != expected) {
            System.out.println("Result is INCORRECT - race condition (no synchronization).");
        } else {
            System.out.println("Got lucky this time - run again to see the race condition.");
        }
    }
}
