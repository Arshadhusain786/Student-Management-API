package com.firstcompany.studentManagementSystem;

public class Student {
    private int admNo;
    private String name;
    private int age;
    private String branch;

    public Student(int admNo,String name,int age,String branch) {
        this.admNo = admNo;
        this.name=name;
        this.age=age;
        this.branch=branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
