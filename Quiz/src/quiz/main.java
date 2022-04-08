/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;
import java.util.Scanner;
import quiz.*;
/**
 *
 * @author achmadmutawazin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu,NIM;
        String name;
        double written,coding,interview;
        System.out.println("REGISTRATION FORM PT.YOSTAR");
        System.out.println("1. Android Development\n2. Web Development");
        System.out.print("Choose Form Type : ");
        Scanner sc = new Scanner(System.in);
        menu = sc.nextInt();
                System.out.println("\nREGISTRATION FORM\n");
                System.out.print("Input Student Number  : ");
                NIM = sc.nextInt();
                System.out.print("Input Name  : ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.print("Input Writing Exam Score : ");
                written = sc.nextDouble();
                System.out.print("Input Coding Exam Score : ");
                coding = sc.nextDouble();
                System.out.print("Input Interview Exam Score : ");
                interview = sc.nextDouble();
                do {
                System.out.print("\n\nMenu\n1. Edit\n2. Output\n3. Exit\nChoose :");
                int choice = sc.nextInt();
                switch(choice){
                    case 1 :
                        System.out.println("EDIT FORM");
                        System.out.print("Input Writing Exam Score : ");
                        written = sc.nextDouble();
                        System.out.print("Input Coding Exam Score : ");
                        coding = sc.nextDouble();
                        System.out.print("Input Interview Exam Score : ");
                        interview = sc.nextDouble();break;
                    case 2 :
                        if (menu == 1){
                            AndroidDev hasil = new AndroidDev(name,written,coding,interview);
                            hasil.writtentest();
                            hasil.codingtest();
                            hasil.interviewtest();
                            hasil.result();break;}
                        else if (menu == 2){
                            WebDev hasil2 = new WebDev(name,written,coding,interview);
                            hasil2.writtentest();
                            hasil2.codingtest();
                            hasil2.interviewtest();
                            hasil2.result();break;}
                    case 3: System.exit(0);
                    default : System.out.println("operation does not exist, please input the options correctly ! ");
                        }}while(true);}}
    
