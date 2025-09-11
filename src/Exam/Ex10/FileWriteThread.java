package Exam.Ex10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWriteThread implements Runnable {

    private static final Logger logger = Logger.getLogger(FileWriteThread.class.getName());
    private final FileMonitor fileMonitor;
    private final int arrayLength;
    private final int[] array;
    private final String filename;

    public FileWriteThread(FileMonitor f) {
        this.fileMonitor = f;
        this.filename = f.getFileName();
        this.arrayLength = (int) (Math.random() * 10);
        this.array = arrayCreateAndFill(arrayLength);
    }

    private int[] arrayCreateAndFill(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Start writing: " + filename);
            writer.write(arrayLength + "\n");
            for (int i = 0; i < arrayLength - 1; i++) {
                writer.write(array[i] + "\n");
            }
            writer.write(String.valueOf(array[arrayLength - 1]));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "IOException while writing file", e);;
        } finally {
            fileMonitor.fileIsReady();
            System.out.println("File is written: " + filename);
        }
    }
}
