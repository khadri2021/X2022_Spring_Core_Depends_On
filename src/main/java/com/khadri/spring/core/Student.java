package com.khadri.spring.core;

public class Student {

    private College college;

    private Address address;

    Student() {

    }

    Student(College college, Address address) {
        this.college = college;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public College getCollege() {
        return college;
    }


    public Address getAddress() {
        return address;
    }
}
