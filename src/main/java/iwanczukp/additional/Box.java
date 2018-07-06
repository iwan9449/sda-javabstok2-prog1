package iwanczukp.additional;

class Box<T, S> {
    private T element;
    private S value;

    Box(T element, S value) {
        this.element = element;
        this.value = value;
    }

    public T getElement() {
        return element;
    }

    public S getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box: {\n   element: " + element + "\n   value: " + value + "\n}";
    }
}

