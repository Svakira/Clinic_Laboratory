package model;

import generics.Pqueue;

public class General {
    private QueueT<Patient>queueT;
    public General(){
        queueT=new QueueT<>();
    }
    public void entryPatients(Node<Patient> patient,int prio){
        queueT.insert(patient,prio);
    }
    public void print(){
        System.out.println();
        System.out.println("General purpose");
        queueT.print();
    }
    public void deleteFromQueue(Patient obj){
        queueT.deleteFromQueue(obj);
    }
    public Patient dequeue(){
        return queueT.deQueue();
    }
    public String list(){
        String list="   General Purpose\n";
        list+= queueT.print();
        return list;
    }

    public QueueT<Patient> getQueue() {
        return queueT;
    }
}
