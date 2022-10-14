package ui;

import model.Controller;
import model.HashTable;
import model.Patient;
import model.QueueT;
import java.util.Scanner;

public class Main {
    public static Patient patient;
    public static  Scanner lect= new Scanner(System.in);

    public static Controller controller=new Controller();
    public static void main(String[] args) {
        controller.readData();
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
        /*System.out.println("Enter the name of the patient");
        String name=lect.nextLine();
        System.out.println("Enter the age of the patient");
        String age=lect.nextLine();
        System.out.println("Enter the id of the patient");
        String id= lect.nextLine();
        System.out.println("Enter the genre of the patient");
        String genre= lect.nextLine();
        System.out.println("Enter the telephone of the patient");
        String telephone= lect.nextLine();
        System.out.println("Does the patient have any priority? such as: PREGNANCY, SICKNESS, ELDERLY (ANSWER: YES/NO)");
        String yesNo=lect.nextLine();
        boolean priority;
        if(yesNo.equalsIgnoreCase("YES")){priority=true;}else{priority=false;}
         patient=new Patient(name, age, id, genre, telephone,priority);
        controller.insertHashAndQueue(patient);*/
        patient=new Patient("sara", "17", "123", "WMO", "123",false);
        controller.insertHashAndQueue(patient);
        patient=new Patient("laura", "17", "124", "WMO", "123",false);
        controller.insertHashAndQueue(patient);
        controller.readData();

    }
    static void searchPatient(){
        System.out.println("To search a patient...");
        System.out.println("Enter the id of the patient");
        String goal=lect.nextLine();
        controller.searchPatient(goal);
    }


}
