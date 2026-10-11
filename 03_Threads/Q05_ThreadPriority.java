class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
    }
}

/**
 * Q5: Thread priorities.
 * Observation: a higher priority only gives the scheduler a HINT; it does not
 * guarantee that the thread runs first. The result may differ between runs / OS.
 */
public class Q05_ThreadPriority {
    public static void main(String[] args) {
        PriorityThread low  = new PriorityThread("Low-Thread");
        PriorityThread norm = new PriorityThread("Normal-Thread");
        PriorityThread high = new PriorityThread("High-Thread");

        low.setPriority(Thread.MIN_PRIORITY);    // 1
        norm.setPriority(Thread.NORM_PRIORITY);  // 5
        high.setPriority(Thread.MAX_PRIORITY);   // 10

        low.start();
        norm.start();
        high.start();
    }
}
