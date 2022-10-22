package generics;

import model.Data;
import model.Node;

public interface Hash<K,V>{
     void insert(K key, V value);
    Data<K,V> search(K key);

    void eliminate(K key);
}
