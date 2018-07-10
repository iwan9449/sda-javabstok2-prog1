package iwanczukp.sortAlgorithms;

import java.util.Arrays;

class SorterTest {

    public static void main(String[] args) {

        int [] testArray = { 17, 8, 2, 9, 3, 12, 13, 14, 19 };

        System.out.println(Arrays.toString(testArray));
        System.out.println("BubbleSort: " + Arrays.toString(Sorter.bubbleSort(testArray.clone())));
        System.out.println(Arrays.toString(testArray));
        System.out.println("HeapSort: " + Arrays.toString(Sorter.heapSort(testArray.clone())));
        System.out.println(Arrays.toString(testArray));
        System.out.println("MergeSort: " + Arrays.toString(Sorter.mergeSort(testArray.clone())));
        System.out.println(Arrays.toString(testArray));
        System.out.println("QuickSort: " + Arrays.toString(Sorter.quickSort(testArray.clone())));
    }

}
