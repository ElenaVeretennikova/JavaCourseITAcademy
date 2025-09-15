package FinalTest.Ex4;

import java.io.*;
import java.util.List;
import java.util.concurrent.Callable;

public class PlayerReaderTask implements Callable<List<Player>> {

    private String filename;

    public PlayerReaderTask(String filename) {
        this.filename = filename;
    }

    @Override
    public List<Player> call() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Player> players = (List<Player>) ois.readObject();
            return players.stream()
                    .filter(Player::isActive)
                    .filter(player -> player.getAge() >= 25 && player.getAge() <= 30)
                    .toList();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
