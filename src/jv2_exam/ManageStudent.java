package jv2_exam;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent implements StudentInterface {
    public ArrayList<Student> stArr = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);
    public int studentId = 0;

    @Override
    public void add() {
        studentId++;
        Student st = new Student();
        st.setStudentId(studentId);
        System.out.println("enter student name");
        st.setName(sc.nextLine());
        System.out.println("enter student address");
        st.setAddress(sc.nextLine());
        System.out.println("enter student phone");
        st.setPhone(sc.nextLine());

        stArr.add(st);
    }

    @Override
    public void show() {

    }

    @Override
    public void display() {

        File f = new File("D:/FPTSchools/ADFII_final_exam.txt");
        String ftxt = "";
        if (f.canRead()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                String line = "";
                while ((line = dis.readLine()) != null) {
                    ftxt += line+"\n";
                    System.out.println(line);
                    String[] strs = line.split("-");
                    jv2_exam.Student st = new jv2_exam.Student(Integer.parseInt(strs[0]), strs[1], strs[2], strs[3]);


                    System.out.println("student id : "+st.getStudentId());
                    System.out.println("name : "+st.getName());
                    System.out.println("address : "+st.getAddress());
                    System.out.println("phone : "+st.getPhone());
                    System.out.println("----------------------------");
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void save() {
        File f = new File("C:\\Users\\AD\\IdeaProjects\\untitled1\\student.txt");
        String ftxt = "";
        if (f.canWrite()) {
            try {
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                for (Student s1:stArr) {
                    String stId = s1.getStudentId()+"-";
                    String stName = s1.getName()+"-";
                    String stAddress = s1.getAddress()+"-";
                    String stPhone = s1.getPhone()+"\n";
                    dos.writeBytes(ftxt+stId+stName+stAddress+stPhone);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}