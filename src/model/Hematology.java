package model;

public class Hematology {
    private QueueT<Patient>queueT;
    public Hematology(){
        queueT=new QueueT<>();
    }
    public void entryPatients(Node<Patient>n, int priority){
        queueT.insert(n,priority);
    }
    public void print(){
        queueT.print();
    }
    public void deleteFromQueue(Patient patient){
        queueT.deleteFromQueue(patient);
    }
    public Node<Patient> dequeue(){
        return queueT.deQueue();
    }
    public String list(){
        String list= "Hematology";
        list+= queueT.print();
        return list;
    }
    public QueueT<Patient> getQueueTq(){
        return queueT;
    }
}
