package com.yanwang.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2017-03-26
 * Time: 23:24
 */
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(generator = "cid")
    @GenericGenerator(name = "cid", strategy = "assigned")
    @Column(length = 4)
    private String id;
    private String name;

    public ClassRoom() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
