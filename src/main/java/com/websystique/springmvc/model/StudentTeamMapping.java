package com.websystique.springmvc.model;

import javax.persistence.*;

/**
 * Created by omoto on 25/7/16.
 */
@Entity
@Table(name = "STUDENT_TEAM_MAPPING")
public class StudentTeamMapping {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "TEAM_NAME")
    private String teamName;


    // getters-setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
