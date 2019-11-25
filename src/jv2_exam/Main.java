package jv2_exam;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        ManageStudent studentManager = new ManageStudent();
        int studentId;


        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                    case "1":
                        studentManager.add();
                        break;
                    case "2":
                        studentManager.show();
                        break;
                    case "3":
                        studentManager.save();



                    default:
                        System.out.println("select again");
                        break;
            }
            if (exit) {
                break;
            }

            showMenu();
        }
    }


    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student records");
        System.out.println("2. Display student records");
        System.out.println("3. Save");
        System.out.println("4. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
