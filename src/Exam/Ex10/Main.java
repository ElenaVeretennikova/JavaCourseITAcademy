package Exam.Ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        List<FileMonitor> fileMonitorList = Stream.of("array1.txt", "array2.txt", "array3.txt")
                .map(FileMonitor::new)
                .toList();
        writeAllArrays(fileMonitorList);
        ArrayList<Integer> resultList = readAllArrays(fileMonitorList);
        System.out.print(resultList + "\n");
        System.out.println("Сумма значений из трех файлов: " + calculateSum(resultList));
        System.out.println("Среднее арифметическое значений из трех файлов: " + calculateArithmeticMean(resultList));
    }
    public static void writeAllArrays(List<FileMonitor> fileMonitorList) {
        try (ExecutorService writingService = Executors.newFixedThreadPool(3)){
            for (FileMonitor f : fileMonitorList) {
                writingService.submit(new FileWriteThread(f));
            }
            writingService.shutdown();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception in file writing process", e);;
        }
    }

    public static ArrayList<Integer> readAllArrays(List<FileMonitor> fileMonitorList) {
        List<ArrayList<Integer>> resultList = new ArrayList<>();

        try (ExecutorService readingService = Executors.newFixedThreadPool(3)){
            for (FileMonitor f : fileMonitorList) {
                Future<ArrayList<Integer>> future = readingService.submit(new FileReadThread(f));
                if (future.isDone()) {
                    resultList.add(future.get());
                } else {
                    try {
                        resultList.add(future.get(1, TimeUnit.SECONDS));
                    } catch (Exception e) {
                        logger.log(Level.SEVERE, "Exception in file reading process", e);
                        future.cancel(false);
                    }
                }
            }
            readingService.shutdown();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception in file reading process", e);

        }
        return resultList.stream()
                .map(a -> a.subList(1, a.size()))
                .flatMap(List::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static long calculateSum(List<Integer> list) {
        return list.stream()
                .mapToLong(Integer::longValue)
                .sum();
    }

    public static double calculateArithmeticMean(List<Integer> list) {
        return list.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0d);
    }
}

