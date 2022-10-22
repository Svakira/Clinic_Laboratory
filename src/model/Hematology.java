package model;

public class Hematology {
    private QueueT<Patient>queueT;
    public Hematology(){
        queueT=new QueueT<>();
    }
    public void entryPatients(Patient patient, int priority){
        queueT.insert(patient,priority);
    }
    public void print(){
        queueT.print();
    }
    public void deleteFromQueue(Patient patient){
        queueT.deleteFromQueue(patient);
    }
    public Patient dequeue(){
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
