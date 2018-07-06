package iwanczukp.dataStructure.queue;

import java.util.Comparator;

class PriorityQueueV2<T> extends LinkedQueue<T> {

    private Comparator<T> comparator;

    PriorityQueueV2(Comparator<T> comparator) {
        super();
        this.comparator = comparator;
    }

    @Override
    public void push(T element) {
        QueueElement<T> newElement = new QueueElement<T>(element);
        if (isEmpty()) {
            last = newElement;
            first = last;
        } else if(comparator.compare(newElement.getValue(), first.getValue()) > 0) {
            newElement.setNextElement(first);
            first = newElement;
        } else if(comparator.compare(newElement.getValue(), last.getValue()) <= 0) {
            last.setNextElement(newElement);
            last = newElement;
        } else {
            QueueElement<T> current = first;
            boolean isInserted = false;
            while (!isInserted) {
                if (comparator.compare(newElement.getValue(), current.getValue()) <= 0 &&
                        comparator.compare(newElement.getValue(), current.getNextElement().getValue()) > 0) {
                    newElement.setNextElement(current.getNextElement());
                    current.setNextElement(newElement);
                    isInserted = true;
                }
                current = current.getNextElement();
            }
        }
        size++;
    }
}
