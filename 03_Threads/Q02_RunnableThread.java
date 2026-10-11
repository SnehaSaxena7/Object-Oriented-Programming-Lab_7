class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

/** Q2: Create a thread by implementing the Runnable interface. */
public class Q02_RunnableThread {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberTask());
        t.start();
    }
}
