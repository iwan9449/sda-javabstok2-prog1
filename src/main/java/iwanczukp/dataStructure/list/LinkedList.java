package iwanczukp.dataStructure.list;

class LinkedList<T> implements List<T> {
    private ListElement<T> head;
    private ListElement<T> tail;
    private Integer size;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public T remove(Integer index) {
        ListElement<T> elementToRemove = findElement(index);
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            ListElement<T> prevElement = elementToRemove.prev;
            ListElement<T> nextElement = elementToRemove.next;

            prevElement.next = nextElement;
            nextElement.prev = prevElement;
        }
        size--;
        return elementToRemove.value;
    }

    @Override
    public void add(T value) {
        ListElement<T> newElement = new ListElement<>(value);
         if (isEmpty()) {
             tail = head = newElement;
         } else {
             tail.next = newElement;
             newElement.prev = tail;
             tail = newElement;
         }
         size++;
    }

    @Override
    public void add(Integer index, T value) {
        if (isEmpty() || index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        ListElement<T> newElement = new ListElement<>(value);
        if (index == 0) {
            head.prev = newElement;
            newElement.next = head;
            head = newElement;
        } else {
            ListElement<T> elementUnderIndex = findElement(index);
            ListElement<T> prevElemUnderIndex = elementUnderIndex.prev;
            prevElemUnderIndex.next = newElement;
            newElement.prev = prevElemUnderIndex;
            newElement.next = elementUnderIndex;
            elementUnderIndex.prev = newElement;
        }
        size++;
    }

    @Override
    public T get(Integer index) {
        return findElement(index).value;
    }

    private ListElement<T> findElement(Integer index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        ListElement<T> currentElement = head;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.next;
        }
        return currentElement;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private class ListElement<S> {
        S value;
        ListElement<S> next;
        ListElement<S> prev;

        ListElement(S value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
}
