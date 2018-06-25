package iwanczukp.excercises;

import java.util.HashMap;
import java.util.Map;

class CashMachine {

    public static void main(String[] args) {
        double value = 734.83;
        Map<Double, Integer> cash = getCash(value);
        System.out.println("Wejście: " + value);
        System.out.println("Wyjście: " + cash);
    }

    // nominały przechowujemy w groszach, żeby uniknąć problemu z niedokładnością double
    private static int [] denominations = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    private static Map<Double, Integer> getCash(double amount) {
        Map<Double, Integer> result = new HashMap<>();
        int amountInPennies = (int) (amount * 100);
        for (int denomination : denominations) {
            if (denomination <= amountInPennies) {
                int count = amountInPennies / denomination;
                amountInPennies -= count * denomination;
                result.put((double) denomination / 100, count);
            }
        }
        return result;
    }

}
