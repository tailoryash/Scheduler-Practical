import com.yash.concurrency.CounterThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("ScheduledExecutorService Object created.");
        System.out.println("Creating Thread Pool 10 Size and 5 Worker Thread.");
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        for (int i = 1; i <= 5; i++) {
            service.schedule(new CounterThread(), i, TimeUnit.SECONDS);

        }
        service.shutdown();
    }
}