class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message " + i + " from " + getName());
        }
    }
}

/** Q1: Create a thread by extending the Thread class. */
public class Q01_ExtendThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();   // NOT t.run() - start() creates a new thread
    }
}
