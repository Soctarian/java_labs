package edu.ntu.dp;

import edu.ntu.dp.controllers.StudentSearcher;
import edu.ntu.dp.models.Student;
import edu.ntu.dp.view.DisplayStudents;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentSearcher studentsByMonth = new StudentSearcher();

        List<Student> findedStudents = studentsByMonth.getStudentByMonth(2);
        DisplayStudents.displayManyStudents(findedStudents);
    }
}
