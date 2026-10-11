class NamePrinter extends Thread {
    NamePrinter(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running: " + getName() + " (iteration " + i + ")");
        }
    }
}

/**
 * Q4: Two threads running simultaneously.
 * Observation: the output of Thread-A and Thread-B is usually interleaved and
 * the order can change on every run. Thread scheduling is decided by the JVM /
 * OS scheduler (time-slicing), not by the programmer, so the order is not guaranteed.
 */
public class Q04_TwoThreadsNames {
    public static void main(String[] args) {
        NamePrinter t1 = new NamePrinter("Thread-A");
        NamePrinter t2 = new NamePrinter("Thread-B");
        t1.start();
        t2.start();
    }
}
