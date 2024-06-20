package org.example.demo.entity;

public class Student {
    private String Studentcode;
    private String Studentname;
    private String phone;
    private String email;

    public String getStudentcode() {
        return Studentcode;
    }

    public void setStudentcode(String studentcode) {
        Studentcode = studentcode;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
