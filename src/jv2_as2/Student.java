package jv2_as2;

public class Student {
    public String name;
    public int age;
    public double mark;

    public Student() {
    }
    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getMark() { return mark; }
    public void setMark(double mark) { this.mark = mark; }
}