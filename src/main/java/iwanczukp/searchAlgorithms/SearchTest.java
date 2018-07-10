package iwanczukp.searchAlgorithms;

import java.util.Arrays;

class SearchTest {

    public static void main(String[] args) {

        int [] testArray = { 2, 8, 9, 12, 13, 14, 19 };

        System.out.println(Arrays.toString(testArray));
        System.out.println("Found 14 on index: " + Search.linearSearch(testArray, 14).orElseThrow(RuntimeException::new));
        System.out.println("Found 14 on index: " + Search.binarySearch(testArray, 14).orElseThrow(RuntimeException::new));
        System.out.println("If 14 exists in collection: " + Search.existsInCollection(testArray, 14));
        System.out.println("If 1 exists in collection: " + Search.existsInCollection(testArray, 1));
    }

}
