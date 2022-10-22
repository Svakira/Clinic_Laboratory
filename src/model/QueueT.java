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
        if (l <= array.size() - 1 && array.get(l).getPriority() > array.get(i).getPriority()) {
            la = l;} else {la = i;}
        if (r <= array.size() - 1 && array.get(r).getPriority() > array.get(la).getPriority()) {
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
    public void insert(Node<T> t, int priority) {
            size++;
            t.setPriority(priority);
            array.add(t);
            increaseKey(size-1,t.getPriority());

    }

    public void buildMaxHeap() {
        size = array.size();
        for (int i = array.size(); i >= 0; i--) {
            maxHeapify(i);
        }

    }


    public void deleteFromQueue(T value){
        Node<T> delete=null;
        for(Node<T>search:array){
            if(search.getValue().equals(value)){
                delete=search;
                break;
            }
        }
           array.remove(delete);
            //if the search is true, that means that the patient was found and ready to remove

    }
    @Override
    public Node<T> deQueue() {
        if(size<1){
            return null;
        }
        Node<T> first= array.get(0);
        array.remove(0);
        if(size!=0){
            size--;
        }
        maxHeapify(0);
        return first;
    }


    @Override
    public T getMax() {
        T max=array.get(0).getValue();
        return max;
    }

//nose
    public void increaseKey(int i, int prio) {
        if(array.get(i).getPriority()>prio) {
            return;
            //saca metodo
        }
        array.get(i).setPriority(prio);
        //if the fathers priority is less than my priority reorganize
        while(i>0 && array.get(i/2).getPriority()<array.get(i).getPriority()) {
            Node<T> change= array.get(i);
            array.set(i,array.get(i/2));
            array.set(1/2,change);
            i=1/2;
        }
    }

    public boolean search(String id){
        for (Node<T> node:array){
            Patient patient=(Patient) node.getValue();
            if(patient.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    //copia
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