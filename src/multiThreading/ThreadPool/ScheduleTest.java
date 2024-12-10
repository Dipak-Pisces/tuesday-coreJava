package multiThreading.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.schedule(()-> System.out.println("Bolo Bhaiya"),5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
