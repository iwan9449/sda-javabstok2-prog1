package iwanczukp.dataStructure.queue;

import java.util.EmptyStackException;

class LinkedQueue<T> implements Queue<T> {

    protected QueueElement<T> first;
    protected QueueElement<T> last;
    protected Integer size;

    LinkedQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public void push(T element) {
        QueueElement<T> nextElement = new QueueElement<>(element);
        if (isEmpty()) {
            last = nextElement;
            first = last;
        } else {
            last.nextElement = nextElement;
            last = last.nextElement;
        }
        size++;
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return first.value;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (size == 1) {
            last = null;
        }
        T temp = first.value;
        first = first.nextElement;
        size--;
        return temp;
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
        return first.toString();
    }

    class QueueElement<S> {
        private S value;
        private QueueElement<S> nextElement;

        QueueElement(S value) {
            this.value = value;
            this.nextElement = null;
        }

        S getValue() {
            return value;
        }

        void setValue(S value) {
            this.value = value;
        }

        QueueElement<S> getNextElement() {
            return nextElement;
        }

        void setNextElement(QueueElement<S> nextElement) {
            this.nextElement = nextElement;
        }

        @Override
        public String toString() {
            return nextElement == null ? "[" + value.toString() + "]" : "[" + value + "] -> " + nextElement;
        }
    }
}
