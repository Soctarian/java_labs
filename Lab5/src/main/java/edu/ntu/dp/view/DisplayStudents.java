package edu.ntu.dp.view;

import edu.ntu.dp.models.Student;

import java.util.List;

public class DisplayStudents {
    public static void displayOneStudent(Student student) {
        System.out.printf("Student ID: %d \n" +
                        "Student name: %s %s %s\n" +
                        "RecordBookID: %d \n" +
                        "Birthday: " + student.getBirthDate() + "\n\n",
                student.getID(),
                student.getFirstName(),
                student.getSecondName(),
                student.getFatherName(),
                student.getRecordBookID()
        );
    }

    public static void displayManyStudents(List<Student> students) {
        for(Student student : students) displayOneStudent(student);
    }
}
