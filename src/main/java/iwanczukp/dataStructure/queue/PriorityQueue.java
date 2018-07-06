package iwanczukp.dataStructure.queue;

interface PriorityQueue<T> {
    void push(T element, Integer priority);
    T pop();
    T front();
    boolean isEmpty();
    int getSize();
}
