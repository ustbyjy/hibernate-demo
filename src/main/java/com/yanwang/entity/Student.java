package com.yanwang.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2017-03-23
 * Time: 0:03
 */
@Entity(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20)
    private String name;
    private String gender;
    private Date birthday;
    private String major;
    private Address address;

    public Student() {

    }

    public Student(Integer id, String name, String gender, Date birthday, String major) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
