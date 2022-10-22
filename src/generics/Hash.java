package generics;

import model.Data;
import model.Node;

public interface Hash<K,V>{
     void insert(K key, V value);
    Node<Data<K,V>> search(K key);

    void deleteKey(K key);
}
