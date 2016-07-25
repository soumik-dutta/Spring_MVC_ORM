package com.websystique.springmvc.model;

import javax.persistence.*;

/**
 * Created by omoto on 25/7/16.
 */
@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MAX_MEMBER")
    private Integer maxMember;


    // getter-setters
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

    public Integer getMaxMember() {
        return maxMember;
    }

    public void setMaxMember(Integer maxMember) {
        this.maxMember = maxMember;
    }
}
