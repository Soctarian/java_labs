package edu.ntu.dp.models;

import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private String fatherName;
    private Date birthDate;
    private int recordBookID;

    public Integer getID() {
        return id;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName)
    {
        this.fatherName = fatherName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }
    public Integer getRecordBookID() {
        return recordBookID;
    }
    public void setRecordBookID(int recordBookID)
    {
        this.recordBookID = recordBookID;
    }
}
