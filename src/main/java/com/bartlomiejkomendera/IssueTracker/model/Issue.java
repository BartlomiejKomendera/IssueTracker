package com.bartlomiejkomendera.IssueTracker.model;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String department;
    private String status;
    private String severity;

    private Instant creationDate;

    @PrePersist
    protected void onCreate(){
        Date curDate = new Date();
        creationDate = curDate.toInstant();
    }

    public Issue() {
    }

    public Issue(String title, String department, String status, String severity) {
        this.title = title;
        this.department = department;
        this.status = status;
        this.severity = severity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }
}
