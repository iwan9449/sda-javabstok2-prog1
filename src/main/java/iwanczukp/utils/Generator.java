package iwanczukp.utils;

import java.util.Random;

public class Generator {

    private static Random random = new Random();

    public static String generateString(int length, int letters) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char)(65 + random.nextInt(letters)));
        }
        return sb.toString();
    }

    public static int [] generateArray(int length, int numbers) {
        int [] array = new int [length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(numbers);
        }
        return array;
    }

}
