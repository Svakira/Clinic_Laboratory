package generics;

import model.Data;
import model.Node;

public interface Hash<K,V>{
     void insert(Data<K,V>data);
    Data<K,V> search(K key);

    void eliminate(K key);
}
