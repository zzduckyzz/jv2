package jv2_exam;

public class Student {
    public int studentId;
    public String name;
    public String address;
    public String phone;

    public Student() {

    }

    public Student(int studentId, String name, String address, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}