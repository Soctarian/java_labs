package edu.ntu.dp.controllers;
import edu.ntu.dp.models.Gender;
import edu.ntu.dp.models.Student;

import java.util.ArrayList;
import java.util.Collection;

public class StudentCreator implements IHumanCreatable<Student> {

    public Student create(String firstName, String secondName, String fatherName, Gender gender)
    {
        Student student = new Student();

        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setFatherName(fatherName);
        student.setGender(gender);

        return student;
    }

    public Student createDefault()
    {
        Student student = new Student();

        student.setFirstName("StudentFirstName");
        student.setSecondName("StudentSecondName");
        student.setFatherName("StudentFatherName");
        student.setGender(Gender.MALE);

        return student;
    }

    public Collection<Student> createDefaultStudentCollection()
    {
        Collection<Student> defaultStudentCollection = new ArrayList<>();
        for (int i = 0; i < 15; i++) defaultStudentCollection.add(createDefault());
        return defaultStudentCollection;
    }
}
