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

    /*public Node search(K goal) {
        Node aux = null;
        for (int i = 0; i < lista.size(); i++) {
            if(search(goal, lista.get(i).getHead())==null){
                continue;
            }else {
               aux=search(goal, lista.get(i).getHead());
                break;
            }
        }
        return aux;
    }*/

    //Recursivo
   /* private Node search(K goal, Node current) {
        //Casos base
        if (current == null) {
            return null;
        }
        if (current.getKey() == goal) {
            return current;
        }
        //Llamados recursivos
        return search(goal, current.getNext());
    }
*/
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
