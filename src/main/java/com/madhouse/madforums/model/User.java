package com.madhouse.madforums.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Users")
public class User {

    private String userId;
    private String name;
    private Date createdDate = new Date();

    public User() {}

    public User(String userId, String name, Date createdDate) {
        this.userId = userId;
        this.name = name;
        this.createdDate = createdDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "Name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "CreatedDate", nullable = false)
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "User [id=" + userId + ", firstName=" + name + ", Created At=" + createdDate
                + "]";
    }
}
