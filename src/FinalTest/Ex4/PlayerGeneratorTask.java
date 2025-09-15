package FinalTest.Ex4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class PlayerGeneratorTask implements Callable<String> {

    public String filename;

    @Override
    public String call() {
        filename = "PlayerListFile" + this;
        List<Player> playerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            playerList.add(new Player("Player" + i, (int) (Math.random() * 21 + 20), random.nextBoolean()));
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(playerList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filename;
    }
}
