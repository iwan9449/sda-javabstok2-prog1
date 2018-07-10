package iwanczukp.utils;

public class Stopwatch {
    private static long start;
    private static long stop;

    public static void start() {
        start = System.currentTimeMillis();
    }

    public static void stop() {
        stop = System.currentTimeMillis();
        System.out.println(getFormattedTime());
    }

    public static String getFormattedTime() {
        long ms = stop - start;
        long sec = ms / 1000;
        long min = sec / 60;
        return min + "min " + (sec - min * 60) + "sec " + (ms - sec * 1000) + "ms";
    }

}
