package iwanczukp.dataStructure.stack;

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int getSize();
}
