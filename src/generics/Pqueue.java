package generics;

public interface Pqueue<T> {
    public void delete(T goal);

    T deQueue();

    public T getMax();
    public void increaseK(T a, int key);

    void increaseKey(T element, int newKey);

    public void insert(T a, int key);
}
