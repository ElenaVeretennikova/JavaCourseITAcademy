package Tests.Test3;

public class Test03Ex10 {
    public static void main(String[] args) {
        Store store = new Store();
        new Thread(new Producer(store)).start();
        new Thread(new Producer(store)).start();
        new Thread(new Producer(store)).start();
    }
}

class Store {
    int itemsCount = 0;
}

class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (store) {
                int itemsCount = store.itemsCount;
                int newValue = (int) (Math.random() * 3) + 1;
                store.itemsCount = itemsCount + newValue;
                System.out.println(Thread.currentThread().getName() + " " + store.itemsCount);
            }
        }
    }
}

