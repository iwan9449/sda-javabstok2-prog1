package iwanczukp.searchAlgorithms;

import java.util.Arrays;
import java.util.Optional;

class Search {

    static Optional<Integer> linearSearch(int [] array, int s) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == s) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

    static Optional<Integer> binarySearch(int [] array, int s) {
        int p = 0;
        int q = array.length - 1;
        while (p < q) {
            int pivot = (p + q) / 2;
            if (s == array[pivot]) {
                return Optional.of(pivot);
            } else if (s < array[pivot]) {
                q = pivot - 1;
            } else {
                p = pivot + 1;
            }
        }
        return Optional.empty();
    }

    static boolean existsInCollection(int [] array, int s) {
        return Arrays.stream(array).filter(elem -> elem == s).findFirst().isPresent();
    }

}
