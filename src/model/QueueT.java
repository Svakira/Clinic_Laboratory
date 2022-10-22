package model;

import generics.Pqueue;

import java.util.ArrayList;

public class QueueT<T> implements Pqueue<T> {
    private int size;
    private Node<T> head;
    private ArrayList<Node<T>>array;

    public QueueT(){
        array= new ArrayList<>();
        this.head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Node<T>> getArray() {
        return array;
    }

    public void setArray(ArrayList<Node<T>> array) {
        this.array = array;
    }

    public Node<T> getParent(int p){
        return array.get((int)p/2);
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void maxHeapify(int index) {
        int l = 2 * index;
        int r = 2 * index + 1;
        int la;
        if (l <= array.size() - 1 && array.get(l).getKey() > array.get(index).getKey()) {
            la = l;} else {la = index;}
        if (r <= array.size() - 1 && array.get(r).getKey() > array.get(la).getKey()) {
            la = r;}
        if (la != index) {
            Node<T> temp = array.get(index);
            Node<T> temp2 = array.get(la);
            array.set(index, temp2);
            array.set(la, temp);
            maxHeapify(la);
        }
    }

    public void buildMaxHeap() {
        size = array.size();
        for (int i = array.size(); i >= 0; i--) {
            maxHeapify(i);
        }

    }
    /*public void insert(T t) {
        Node<T> node = new Node<>(t);
        if (head == null) {
            head = node;
        } else {
            Node<T> puntero = head;
            while (puntero.getNext() != null) {
                puntero = puntero.getNext();
            }
            puntero.setNext(node);
        }
    }

    public Node search(T goal) {
        return search(goal, head);
    }

    //Recursivo
    private Node<T> search(T goal, Node<T> current) {
        //Casos base
        if (current == null) {
            return null;
        }
        if (current.getValue() == goal) {
            return current;
        }
        //Llamados recursivos
        return search(goal, current.getNext());
    }

    public void insertarNodo(Node<T> t) {
        if (head == null) {
            head = t;
        } else {
            Node<T> puntero = head;
            while (puntero.getNext() != null) {
                puntero = puntero.getNext();
            }
            puntero.setNext(t);
        }
    }*/
    public void deleteFromQueue(Patient obj){
        for (int i = 0;i < array.size();i++){
            if(array.get(i).getValue().equals(obj)){
                array.remove(i);
            }
        }
    }
    @Override
    public T deQueue() {
        int p = 0;
        if(array.size()<1){
            return null;
        }else{
            for (int i=0;i < array.size();i++){
                if(array.get(i).getKey()>array.get(p).getKey()){
                    p=i;
                }
            }
            T max = array.get(p).getValue();
            array.remove(p);
            maxHeapify(1);
            return max;
        }


    }

    @Override
    public T getMax() {
        return array.get(0).getValue();
    }

    @Override
    public void increaseKey(T element, int newKey) {
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getValue().equals(element)){
                index = i;
            }
        }
        if(newKey > array.get(index).getKey()) {
            array.get(index).setKey(array.get(index).getKey()+newKey);
            buildMaxHeap();
        }
    }
    @Override
    public void insert(T a, int key) {
        array.add(new Node<>(a, key));
        buildMaxHeap();
    }
    public boolean search(String id){
        for (Node<T> node:array){
            Patient a=(Patient) node.getValue();
            if(a.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public String print(){
        String message="";
        int cont=0;
        for (Node<T> tNode : array) {
            Patient a=(Patient)tNode.getValue();
            message +=++cont+". "+a.getName()+"\n";
        }
        return message;
    }
    /*public void delete(T goal) {
        delete(goal, head, new QueueT<T>());
    }

    private void delete(T goal, Node<T> current, QueueT<T> out) {
        //Casos bases
        if (current == null) {
            head = out.head;
        } else {
            //Delete head
            if (current.getValue() == goal) {
                out.insertarNodo(current.getNext());
                head = out.head;
                return;
            }

            //Llamado recursivo
            out.insert(current.getValue());
            delete(goal, current.getNext(), out);
        }


    }

    public void mostrar() {
        Node<T> puntero = head;
        while (puntero != null) {
            System.out.print(puntero.getValue() + "-->");
            puntero = puntero.getNext();
        }
        System.out.println("null");
    }*/

    //falta heap


}