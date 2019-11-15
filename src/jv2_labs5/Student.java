package jv2_labs5;

public class Student {
    public Integer id;
    public String student_name;
    public Integer age;
    public Integer mark;

    public Student() {
    }

    public Student(Integer id, String student_name, Integer age, Integer mark) {
        this.id = id;
        this.student_name = student_name;
        this.age = age;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
