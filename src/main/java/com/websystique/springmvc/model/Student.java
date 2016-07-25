package com.websystique.springmvc.model;

import javax.persistence.*;

/**
 * Created by omoto on 25/7/16.
 */
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;




    // getter-setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
