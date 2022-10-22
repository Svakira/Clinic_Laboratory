package ui;

import model.Controller;
import model.Patient;
import java.util.Scanner;

public class Main {
    public static Patient patient;
    public static  Scanner lect= new Scanner(System.in);

    public static Controller controller=new Controller();
    public static void main(String[] args) {
        boolean entry=true;
        int answEntry;
        while(entry){
            menu();
            answEntry= lect.nextInt();
            lect.nextLine();
            switch (answEntry){
                case 1:
                    registerPatient();
                    break;
                case 2:
                    searchPatient();
                    break;
                case 3:
                    entry=false;
                    break;
            }
        }
    }

    static void menu(){
        System.out.println("-----------------------");
        System.out.println("What do you want to do?...");
        System.out.println("1. Register patient");
        System.out.println("2. Search patient");
        System.out.println("3. Get out");

    }

    static void registerPatient(){
        System.out.println("Enter the id of the patient");
        String id= lect.nextLine();
        if(controller.searchPatient(id)!=null){
            System.out.println("This patient is already registered");
        }
        System.out.println("Enter the name of the patient");
        String name=lect.nextLine();
        System.out.println("Enter the age of the patient");
        String age=lect.nextLine();
        System.out.println("Enter the genre of the patient");
        String genre= lect.nextLine();
        System.out.println("Enter the telephone of the patient");
        String telephone= lect.nextLine();
        System.out.println("Does the patient have any priority? 1. YES 2. NO");
        int priority=lect.nextInt();
        int elderly=0;
        int pregnant=0;
        int illness=0;
        if(priority==1){
            System.out.println("Is the patient elderly? 1. YES 2. NO");
            elderly=lect.nextInt();
            lect.nextLine();
            System.out.println("Is the patient pregnant? 1. YES 2. NO");
            pregnant=lect.nextInt();
            lect.nextLine();
            System.out.println("Is the patient illness in a serious way? 1. YES 2. NO");
            illness=lect.nextInt();
            lect.nextLine();
        }
        System.out.println("Do you want to undo the register of the patient? 1. YES 2. NO");
        int undo=lect.nextInt();
        lect.nextLine();
        if(undo==1){
            controller.deleteFromHash(id);
        }else{
            System.out.println("The patient was registered");
        }
        patient=new Patient(name, age, id, genre, telephone,pregnant, elderly, illness);
        controller.insertPatient(patient);
        controller.readData();

    }
    static void searchPatient(){
        System.out.println("To search a patient...");
        System.out.println("Enter the id of the patient");
        String goal=lect.nextLine();
        controller.searchPatient(goal);
    }
    public static void entryPatient(){
        System.out.println("Enter the id of the patient");
        String id= lect.nextLine();
        if(!controller.alreadyRegisterePatient(id)){
            System.out.println("The patient is not registered");
        }else {
            System.out.println("Send to 1. Hematology 2. General purpose");
            int lab = lect.nextInt();
            lect.nextLine();
            controller.entryPatients(controller.searchPatient(id), controller.searchPatient(id).getPriority(), lab);
            System.out.println("Undo ? 1. Yes 2. No");
            int undo = lect.nextInt();
            lect.nextLine();
            if (undo == 1) {
                controller.deleteFromQueue(controller.searchPatient(id), lab);
            }
            System.out.println("Client added successfully to the queue");

        }

    }
    public static void exitQueue(){
        System.out.println("From which unit do you want to dequeue the patient ?  1. Hematology 2. General Purpose ");
        int lab=lect.nextInt();
        lect.nextLine();

        Patient pat=controller.dequeue(lab);
        if(pat!=null){
            System.out.println("The patient "+pat.getName()+" has successfully exited the queue");
            System.out.println("Undo ? 1. Yes 2. No");
            int undo=lect.nextInt();
            lect.nextLine();
            if(undo==1){
                controller.entryPatients(pat, pat.getPriority(),lab);
            }
        }else{
            System.out.println("No patients found in the queue");
        }
        System.out.println("Client had been exited succesfully");
    }

}