package com.MyCompany.StudentManagementPortal;

public class Student {
    private int admissionNo;
    private String name;
    private int age;
    private String branch;

    public Student(int admissionNo, String name, int age, String branch) {
        this.admissionNo = admissionNo;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
