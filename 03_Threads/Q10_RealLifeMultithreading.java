class FileDownloader implements Runnable {
    private final String fileName;
    private final int sizeMB;

    FileDownloader(String fileName, int sizeMB) {
        this.fileName = fileName;
        this.sizeMB = sizeMB;
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Started downloading " + fileName);
        for (int mb = 1; mb <= sizeMB; mb++) {
            try {
                Thread.sleep(300);   // simulate network delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + Thread.currentThread().getName() + "] " + fileName
                    + " -> " + mb + "/" + sizeMB + " MB");
        }
        System.out.println("[" + Thread.currentThread().getName() + "] Finished " + fileName);
    }
}

/**
 * Q10: Real-life multithreading - downloading multiple files in parallel.
 *
 * Thread roles:
 *  - main thread        : coordinator; creates and starts the download threads,
 *                         then waits (join) until all of them are finished.
 *  - Downloader-Video   : downloads the video file.
 *  - Downloader-Music   : downloads the music file.
 *  - Downloader-Document: downloads the document.
 * All downloads run at the same time, so total time is roughly that of the
 * largest file instead of the sum of all files.
 */
public class Q10_RealLifeMultithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new FileDownloader("movie.mp4", 5), "Downloader-Video");
        Thread t2 = new Thread(new FileDownloader("song.mp3", 3), "Downloader-Music");
        Thread t3 = new Thread(new FileDownloader("notes.pdf", 2), "Downloader-Document");

        System.out.println("Main: starting all downloads...");
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Main: all downloads completed.");
    }
}
