package iwanczukp.dataStructure.queue;

import java.io.Serializable;

interface Queue<T> {
    void push(T element);
    T pop();
    T front();
    boolean isEmpty();
    int getSize();
}
