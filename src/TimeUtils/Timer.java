package TimeUtils;

import java.util.Date;

public class Timer {
    private static long start;
    private static long stop;

    public static void start(){
        Date date = new Date();
        start=date.getTime();
    }

    public static void stop(){
        Date date = new Date();
        stop=date.getTime();
    }

    public static long getElapsedTime(){
        return stop-start;
    }
}
