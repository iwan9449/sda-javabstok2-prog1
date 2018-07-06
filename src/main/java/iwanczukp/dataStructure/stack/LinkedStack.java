package iwanczukp.dataStructure.stack;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private StackElement<T> top;
    private int size;

    LinkedStack() {
        this.top = null;
    }

    @Override
    public void push(T element) {
        this.top = new StackElement<>(element, this.top);
        this.size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top.value;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        this.size--;
        T temp = this.top.value;
        this.top = this.top.previousElement;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        if (this.top == null) {
            return "[]";
        }
        return this.top.toString();
    }

    private class StackElement<S> {
        private S value;
        private StackElement<S> previousElement;

        StackElement(S value, StackElement<S> previousElement) {
            this.value = value;
            this.previousElement = previousElement;
        }

        @Override
        public String toString() {
            if (this.previousElement == null) {
                return "[" + this.value.toString() + "]\n";
            }
            return "[" + this.value.toString() + "]\n" + this.previousElement.toString();
        }
    }
}
