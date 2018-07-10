package iwanczukp.sortAlgorithms;

import iwanczukp.dataStructure.tree.Heap;

import java.util.Arrays;

public class Sorter {

    public static int [] quickSort(int [] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private static int [] quickSort(int [] array, int left, int right) {
        int index = partition(array, left, right);

        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }

        if (index < right) {
            quickSort(array, index, right);
        }
        return array;
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];
        int p = left;
        int q = right;

        while (p <= q) {
            while (array[p] < pivot) {
                p++;
            }
            while (array[q] > pivot) {
                q--;
            }
            if (p <= q) {
                int temp = array[p];
                array[p] = array[q];
                array[q] = temp;
                p++;
                q--;
            }
        }
        return p;
    }

    public static int [] mergeSort(int [] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    private static int [] mergeSort(int [] array, int left, int right) {
        if (left < right) {
            int pivot = (left + right) / 2;
            mergeSort(array, left, pivot);
            mergeSort(array, pivot + 1, right);
            merge(array, left, pivot, right);
        }
        return array;
    }

    private static int [] merge(int [] array, int left, int pivot, int right) {
        int [] tempArray = array.clone();
        int p = left;
        int q = pivot + 1;
        int current = left;

        while (p <= pivot && q <= right) {
            if (tempArray[p] <= tempArray[q]) {
                array[current++] = tempArray[p++];
            } else {
                array[current++] = tempArray[q++];
            }
        }

        while (p <= pivot) {
            array[current++] = tempArray[p++];
        }

        return array;
    }

    public static int [] heapSort(int [] array) {
        Heap heap = new Heap(array.length);
        Arrays.stream(array).forEach(heap::add);
        for (int i = array.length - 1; heap.hasNodes(); i--) {
            array[i] = heap.remove();
        }
        return array;
    }

    public static int [] bubbleSort(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
