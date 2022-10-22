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
        new HashTable<>(100000);
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
    public void insertPatient(Patient patient){
        hashTable.insert(patient.getId(), patient);
    }
    public void entryPatients(Patient patient, int priority,int des){
        if(des== 1){
            hematology.entryPatients(patient,priority);
        }else{
            general.entryPatients(patient,priority);
        }
    }
    public Patient searchPatient(String id){
        return hashTable.search(id).getValue();
    }

    public boolean alreadyRegisterePatient(String id){
        return hashTable.search(id) != null;
    }
    public void deleteFromHash(String id){
        hashTable.deleteKey(id);
    }
    public void deleteFromQueue(Patient id,int lab){
        if(lab == 1){
            hematology.deleteFromQueue(id);
        }else{
            general.deleteFromQueue(id);
        }

    }
    public Patient dequeue(int lab){
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

    public Hematology getHematology() {
        return hematology;
    }

    public General getGeneral() {
        return general;
    }

}