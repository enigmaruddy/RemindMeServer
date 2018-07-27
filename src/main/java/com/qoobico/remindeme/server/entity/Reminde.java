package com.qoobico.remindeme.server.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="reminde")
public class Reminde {


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "reminde_date", nullable = false)
    private Date remindeDate;

    public Reminde() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRemindeDate() {
        return remindeDate;
    }

    public void setRemindeDate(Date remindeDate) {
        this.remindeDate = remindeDate;
    }
}
