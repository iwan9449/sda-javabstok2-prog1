package iwanczukp.dataStructure.queue;

import java.util.EmptyStackException;

class PriorityQueueV1<T> implements PriorityQueue<T> {

    private QueueElement<T> first;
    private QueueElement<T> last;
    private Integer size;

    PriorityQueueV1() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public void push(T element, Integer priority) {
        QueueElement<T> newElement = new QueueElement<>(element, priority);
        if (isEmpty()) {
            last = newElement;
            first = last;
        } else if(newElement.priority > first.priority) {
            newElement.nextElement = first;
            first = newElement;
        } else if(newElement.priority <= last.priority) {
            last.nextElement = newElement;
            last = newElement;
        } else {
            QueueElement<T> current = first;
            boolean isInserted = false;
            while (!isInserted) {
                if (newElement.priority <= current.priority && newElement.priority > current.nextElement.priority) {
                    newElement.nextElement = current.nextElement;
                    current.nextElement = newElement;
                    isInserted = true;
                }
                current = current.nextElement;
            }
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

    private class QueueElement<S> {
        private S value;
        private Integer priority;
        private QueueElement<S> nextElement;

        QueueElement(S value, Integer priority) {
            this.value = value;
            this.priority = priority;
            this.nextElement = null;
        }

        @Override
        public String toString() {
            return nextElement == null ? "[" + value.toString() + "]" : "[" + value + "] -> " + nextElement;
        }
    }
}
