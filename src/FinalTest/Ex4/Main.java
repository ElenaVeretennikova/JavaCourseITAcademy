package FinalTest.Ex4;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool(4);) {
            List<Player> playerList;
            for (int i = 0; i < 20; i++) {
                Future<String> futureFilename = executor.submit(new PlayerGeneratorTask());
                if (futureFilename.isDone()) {
                   playerList = (executor.submit(new PlayerReaderTask(futureFilename.get()))).get();
                } else {
                    try {
                       playerList = (executor.submit(new PlayerReaderTask(futureFilename.get(1, TimeUnit.SECONDS)))).get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}