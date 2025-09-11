package Exam.Ex10;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FileMonitor {

    private static final Logger logger = Logger.getLogger(FileMonitor.class.getName());
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
            logger.log(Level.SEVERE, "Interrupted exception while waiting for file completion", e);
        }
    }

    public String getFileName() {
        return fileName;
    }
}



