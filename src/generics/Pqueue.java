package generics;

import model.Node;

public interface Pqueue<T> {

    Node<T> deQueue();

    T getMax();

     void insert(Node<T> node, int priority);
}
