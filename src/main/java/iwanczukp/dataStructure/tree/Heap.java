package iwanczukp.dataStructure.tree;

import java.util.Arrays;

public class Heap {
    private int[] tree;
    private int lastIndex;

    public Heap(int size) {
        this.tree = new int [size];
        this.lastIndex = 0;
    }

    public void add(int value) {
        int currentIndex = lastIndex++;
        int parentIndex = currentIndex != 0 ? getParentIndex(currentIndex) : 0;
        while (currentIndex > 0 && tree[parentIndex] < value) {
            tree[currentIndex] = tree[parentIndex];
            currentIndex = parentIndex;
            parentIndex = currentIndex != 0 ? getParentIndex(currentIndex) : 0;
        }
        tree[currentIndex] = value;
    }

//    public int remove() {
//        if (lastIndex == 0) {
//            throw new IndexOutOfBoundsException();
//        }
//        lastIndex--;
//        int lastValue = tree[lastIndex];
//        int currentIndex = 0;
//        int elementToRemove = tree[currentIndex];
//        int biggerChildIndex = getBiggerChildIndex(currentIndex);
//        while (biggerChildIndex < lastIndex && tree[biggerChildIndex] > lastValue) {
//            tree[currentIndex] = tree[biggerChildIndex];
//            currentIndex = biggerChildIndex;
//            biggerChildIndex = getBiggerChildIndex(biggerChildIndex);
//        }
//        tree[currentIndex] = lastValue;
//        return elementToRemove;
//    }
//
//    private int getBiggerChildIndex(int index) {
//        if (hasRightChild(index)) {
//            return getLeftChild(index) > getRightChild(index) ? getLeftChildIndex(index) : getRightChildIndex(index);
//        } else if (hasLeftChild(index)) {
//            return getLeftChildIndex(index);
//        } else {
//            return lastIndex + 1;
//        }
//    }



    public int remove() {
        if (!hasNodes()) {
            throw new IndexOutOfBoundsException();
        }
        int elementToRemove = tree[0];
        int currentIndex = 0;
        int greaterChildIndex = getGreaterChildIndex(0);
        int lastValue = tree[--lastIndex];

        while (greaterChildIndex < lastIndex && tree[greaterChildIndex] > lastValue) {
            tree[currentIndex] = tree[greaterChildIndex];
            currentIndex = greaterChildIndex;
            greaterChildIndex = getGreaterChildIndex(currentIndex);
        }
        tree[currentIndex] = lastValue;

        return elementToRemove;
    }

    private int getGreaterChildIndex(int index) {
        if (hasRightChild(index)) {
            return getLeftChild(index) > getRightChild(index) ? getLeftChildIndex(index) : getRightChildIndex(index);
        } else if (hasLeftChild(index)) {
            return getLeftChildIndex(index);
        } else {
            return lastIndex + 1;
        }
    }


    int getValue(int index) {
        return tree[index];
    }

    int getLeftChild(int index) {
        return tree[getLeftChildIndex(index)];
    }

    int getRightChild(int index) {
        return tree[getRightChildIndex(index)];
    }

    int getLeftChildIndex(int index) {
        if (hasLeftChild(index)) {
            return 2 * index + 1;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean hasLeftChild(int index) {
        return (2 * index + 1) < lastIndex;
    }

    int getRightChildIndex(int index) {
        if (hasRightChild(index)) {
            return 2 * index + 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean hasRightChild(int index) {
        return (2 * index + 2) < lastIndex;
    }

    int getParentIndex(int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    boolean isLeaf(int index) {
        return !hasLeftChild(index);
    }

    public boolean hasNodes() {
        return lastIndex > 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(tree, 0, lastIndex));
    }

}
