package ui;

import model.HashTable;
import model.QueueT;

import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        QueueT<Integer> queue = new QueueT<Integer>();
        queue.insert(123);
        queue.insert(13);
        queue.insert(133);
        queue.mostrar();
        queue.delete(13);
        System.out.println(queue.search(13));
        queue.mostrar();
        //cuando cree clase paciente reemplazar con Integer
        HashTable<String, Integer> hashTable = new HashTable<>(100000);
        hashTable.insert("1", 12);
        hashTable.insert("in", 56);
        hashTable.eliminate("1");


    }


}
