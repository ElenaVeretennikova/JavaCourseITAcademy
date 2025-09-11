package Exam.Ex10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadThread implements Callable<ArrayList<Integer>> {

    private static final Logger logger = Logger.getLogger(FileReadThread.class.getName());

    private final FileMonitor fileMonitor;
    private final String filename;
    private final ArrayList<Integer> list = new ArrayList<>();

    public FileReadThread(FileMonitor f) {
        this.fileMonitor = f;
        this.filename = f.getFileName();
    }

    @Override
    public ArrayList<Integer> call() {
        fileMonitor.waitRorCompletion();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Start reading: " + filename);
            String s;
            while ((s = reader.readLine()) != null) {
                list.add(Integer.parseInt(s));
            }
            return list;
        } catch (IOException e) {
            logger.log(Level.SEVERE, "IOException while reading file", e);
            return null;
        } finally {
            System.out.println("File is read: " + filename);
        }
    }
}
