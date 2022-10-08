package model;

import java.util.ArrayList;

public class HashTable<K, V> {
    private int size;
    private ArrayList<QueueT<Data<K, V>>> lista;

    public HashTable(int size) {
        this.size = size;
        this.lista = lista;
        lista = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            lista.add(i, new QueueT<Data<K, V>>());
        }
    }

    public int getHashIndex(K key) {
        return key.hashCode() % size;
    }

    public void insert(K key, V value) {
        int call = getHashIndex(key);
        Data<K, V> data = new Data<>(key, value);
        lista.add(call, lista.get(call));
        lista.get(call).insert(data);
        lista.get(call).mostrar();
    }

    public Node<Data<K,V>> search(K key){
        int k = getHashIndex(key);
        QueueT<Data<K, V>> queueT = lista.get(k);
        Node<Data<K, V>> aux = queueT.getHead();
        while (aux != null) {
            if (aux.getValue().getKey() == key) {
                return aux;
            }

        }
        return null;
    }
    public void eliminate(K key) {
        int call = getHashIndex(key);
        QueueT<Data<K, V>> queueT = lista.get(call);
        Node<Data<K, V>> aux = queueT.getHead();
        while (aux != null) {
            if (aux.getValue().getKey() == key) {
                lista.get(call).delete(aux.getValue());
                aux = queueT.getHead();
            } else {
                aux = aux.getNext();
            }

        }

    }


}
