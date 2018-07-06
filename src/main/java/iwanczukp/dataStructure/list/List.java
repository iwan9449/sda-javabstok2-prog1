package iwanczukp.dataStructure.list;

interface List<T> {
    T get(Integer index);
    void add(T value);
    void add(Integer index, T value);
    T remove(Integer index);
    boolean isEmpty();
    Integer getSize();
}
