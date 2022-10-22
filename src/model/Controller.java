package model;

import java.io.*;

public class Controller {

    public static HashTable<String, Patient> hashTable ;

    private Hematology hematology;
    private General general;



    public Controller() {
        readData();
        hematology=new Hematology();
        general = new General();
        hashTable=new HashTable<>(1000000);

    }
    public void readData(){
        try {
            File file= new File(".\\files\\File.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void writeData(String data){
        try {
            File file= new File(".\\files\\File.txt");
            FileWriter fileWriter= new FileWriter(file,true);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.flush();
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void insertPatient(String id,Patient patient){
        Data<String, Patient>data=new Data<>(id,patient);
        hashTable.insert(data);
        writeData(patient.toString());
    }
    public void entryPatients(Patient patient, int priority,int des){
        Node<Patient>patientNode=new Node<>(patient);
        if(des== 1){
            hematology.entryPatients(patientNode,priority);
        }else{
            general.entryPatients(patientNode,priority);
        }
    }
    public Patient searchPatient(String id){
        if(hashTable.search(id)!=null){
            return hashTable.search(id).getValue();
        }
        return null;
    }
    public Node<Patient> searchNode(String id){
        Node<Patient>node=new Node<>(hashTable.search(id).getValue());
        if(node!=null){
            return node;
        }
        return null;
    }

    public boolean alreadyRegisterePatient(String id){
        return hashTable.search(id) != null;
    }
    public void deleteFromHash(String id){
        hashTable.eliminate(id);
    }
    public void deleteFromQueue(Patient id,int lab){
        if(lab == 1){
            hematology.deleteFromQueue(id);
        }else{
            general.deleteFromQueue(id);
        }

    }
    public Node<Patient> dequeue(int lab){
        if(lab == 1){
            return hematology.dequeue();
        }else{
            return general.dequeue();
        }

    }
    public String patientsList(){
        String message="";
        message+=hematology.list();
        message+=general.list();
        return message;
    }

    public String printear(){
        return hashTable.data();
    }


    public Hematology getHematology() {
        return hematology;
    }

    public General getGeneral() {
        return general;
    }



}