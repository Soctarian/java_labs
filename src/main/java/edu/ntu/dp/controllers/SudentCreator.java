package edu.ntu.dp.controllers;

import edu.ntu.dp.models.Student;

import java.util.Date;

public class SudentCreator {
    public Student createStudent(int ID, String firstName, String secondName, String fatherName, Date birthDate, int scoreBookID)
    {
        Student student = new Student();
        student.setID(ID);
        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setFatherName(fatherName);
        student.setBirthDate(birthDate);
        student.setRecordBookID(scoreBookID);
        return student;
    }
}
