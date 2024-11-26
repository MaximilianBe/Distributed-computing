import javax.xml.transform.stream.StreamSource;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String filename = "id.dat";
        UniqueId uniqueId = new UniqueId(filename);

        uniqueId.init(10000);

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new IdIncrementer(uniqueId), "Thread-" + (i + 1));
            thread.start();
        }
    }
}
