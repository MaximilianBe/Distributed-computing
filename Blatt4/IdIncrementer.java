import java.io.IOException;

class IdIncrementer implements Runnable {
    private UniqueId uniqueId;

    public IdIncrementer(UniqueId uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int newId = 0;
            try {
                newId = uniqueId.getNext();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " hat ID: " + newId);
        }
    }
}
