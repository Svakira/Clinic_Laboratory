package model;

import generics.Hash;

import java.util.ArrayList;

public class HashTable<K, V>  implements Hash<K,V> {
    private int size;
    private Data<K, V>[] lista;

    public HashTable(int size) {
        this.size = size;
        lista = new Data[size];

    }

    public Data<K, V>[] getLista() {
        return lista;
    }

    public void setLista(Data<K, V>[] lista) {
        this.lista = lista;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int getHashIndex(K key) {
        return key.hashCode() % size;
    }
//CPIA
    public void insert(K key, V value) {
        int call = getHashIndex(key);
        Data<K,V> listN=lista[call];

        if(listN==null) {
            lista[call]=new Data<>(key, value);
        }else{
            while (listN != null) {
                if(listN.getKey().equals(key)) {
                    break;
                }
                listN = listN.getNext();
            }
            Data<K,V> nF= new Data<>(key, value);
            lista[call].setPrev(nF);
            nF.setNext(lista[call]);
            lista[call] = nF;
        }

    }

    public Data<K,V> search(K key){
        int k = getHashIndex(key);
        Data<K,V> value=null;
        Data<K, V> queueT = lista[k];
        Data<K, V> aux = queueT;
        while (queueT != null) {
            if (aux.getKey() == key) {
                value= (Data<K, V>) aux.getValue();
            }
            aux=aux.getNext();
        }
        return value;
    }
    public void eliminate(K key) {
        int call = getHashIndex(key);
        Data<K, V> queue = lista[call];
        Data<K, V> aux = queue;
        while (aux != null) {
            if (aux.getKey() == key) {
                //if the current key is the same key we want to eliminate the current node his new value is going to be the next before him
                Data<K, V> prev = aux.getPrev();
                Data<K, V> next = aux.getNext();
                if (queue.getKey() == lista[call]) {
                    lista[call] = next;
                } else if (next != null) {
                    next.setPrev(prev);
                } else if (prev != null) {
                    prev.setNext(next);
                }

            }
                queue=queue.getNext();
        }
    }

        public void show(){
        for(int i=0; i<lista.length; i++){
            if(lista[i]!=null){
                System.out.println(lista[i].getValue());
            }
        }
    }


}