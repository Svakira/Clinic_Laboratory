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
    public void maxHeapify(int i) {
        int l = 2 * i;
        int r = 2 * i + 1;
        int la;
        if (l <= array.size() - 1 && array.get(l).getKey() > array.get(i).getKey()) {
            la = l;} else {la = i;}
        if (r <= array.size() - 1 && array.get(r).getKey() > array.get(la).getKey()) {
            la = r;}
        if (la != i) {
            Node<T> temp = array.get(i);
            Node<T> temp2 = array.get(la);
            array.set(i, temp2);
            array.set(la, temp);
            maxHeapify(la);
        }
    }

    @Override
    public void insert(T a, int key) {
        array.add(new Node<>(a, key));
        buildMaxHeap();
    }
    public void buildMaxHeap() {
        size = array.size();
        for (int i = array.size(); i >= 0; i--) {
            maxHeapify(i);
        }

    }


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
        T firstInQueue=null;
        //base case
        if(array.isEmpty()){
            return firstInQueue;
        }
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




    @Override
    public T getMax() {
        return array.get(0).getValue();
    }


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



}