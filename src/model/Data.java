package model;

public class Data<K, V> {
    private K key;
    private V value;

    private Data<K,V> prev;
    private Data<K,V>next;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Data<K, V> getPrev() {
        return prev;
    }

    public void setPrev(Data<K, V> prev) {
        this.prev = prev;
    }

    public Data<K, V> getNext() {
        return next;
    }

    public void setNext(Data<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}