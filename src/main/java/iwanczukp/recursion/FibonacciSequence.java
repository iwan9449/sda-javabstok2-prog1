package iwanczukp.recursion;

import iwanczukp.utils.Stopwatch;

public class FibonacciSequence {

    public static void main(String[] args) {
        int testValue = 10;
        // Dodatkowo zmierzyłem czas jaki zajmuje wykonanie algorytmu iteracyjnego i rekurencyjnego.
        // Jak można zauważyć dla liczb mniejszych od 35 czasy są zbliżone, ale dla większych liczb
        // czas wykonania algorytmu rekurencyjnego zaczyna dramatycznie się wydłużać.
        Stopwatch.start();
        System.out.println(iterationFibonacciSequence(testValue));
        Stopwatch.stop();
        Stopwatch.start();
        System.out.println(recursionFibonacciSequence(testValue));
        Stopwatch.stop();
    }

    public static long iterationFibonacciSequence(int n) {
        if (n == 0) {
            return 0;
        }
        long f1 = 0;
        long f2 = 1;
        for (int i = 1; i < n; i++) {
                f2 += f1;
                f1 = f2 - f1;
        }
        return f2;
    }

    static long recursionFibonacciSequence(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        return recursionFibonacciSequence(n - 2) + recursionFibonacciSequence(n - 1);
    }

}
