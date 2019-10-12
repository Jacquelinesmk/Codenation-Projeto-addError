package com.example.AddError.model;

import com.sun.istack.NotNull;
import org.hibernate.event.spi.ClearEventListener;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "TB_ERROR")
public class Error implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotNull
    @Size(max = 20)
    private String level;

    @Column
    @NotNull
    @Size(max = 50)
    private String origin;

    @Column
    @NotNull
    @Size(max = 128)
    private String description;

    @Column
    @Size(max = 300)
    private String details;

    @Column
    @NotNull
    private Timestamp dateLogged;

    @Column
    @NotNull
    @Size(max = 10)
    private String status;

    @Column
    @NotNull
    @Size(max = 50)
    private String environment;


    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Timestamp getDateLogged() {
        return dateLogged;
    }

    public void setDateLogged(Timestamp dateLogged) {
        this.dateLogged = dateLogged;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
