package iwanczukp.dataStructure.stack;

import java.util.EmptyStackException;

class ArrayStack<T> implements Stack<T> {

    private T [] stack;
    private T top;
    private Integer size;

    ArrayStack(Integer size) {
        stack = (T[]) new Object [size];
        this.size = 0;
    }

    @Override
    public void push(T element) {
         if (size != stack.length) {
             stack[size++] = element;
             top = element;
         } else {
             System.out.println("Stos został zapoełniony! Nie można dodać kolejnego elemetu!");
         }

    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return top;
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            size--;
            if (size == 0) {
                top = null;
                return stack[size];
            }
            top = stack[size - 1];
            return stack[size];

        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append('[');
            sb.append(stack[i]);
            sb.append(']');
            if (i != size - 1) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
