package FinalTest.Ex4;


public class FileMonitor {
    private final String fileName;
    private boolean fileIsCompleted = false;

    public FileMonitor(String fileName) {
        this.fileName = fileName;
    }

    public synchronized void fileIsReady() {
        fileIsCompleted = true;
        notify();
    }

    public synchronized void waitRorCompletion() {
        try {
            while (!fileIsCompleted) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getFileName() {
        return fileName;
    }
}

