package model;

import java.io.*;

public class Controller {
    public static QueueT<Patient> queueN = new QueueT<Patient>();
    public static QueueT<Patient> priorityQ = new QueueT<Patient>();
    public static HashTable<String, Patient> hashTable = new HashTable<>(100000);



    public Controller() {
        readData();
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
    public void insertHashAndQueue(Patient patient){
        if(patient.isPriority()==true){
            priorityQ.insert(patient);
        }else{
            queueN.insert(patient);
        }
        writeData(patient.toString());
        hashTable.insert(patient.getId(), patient);
    }
    public void searchPatient(String id){
        hashTable.search(id);
    }

}
