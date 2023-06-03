package edu.ntu.dp.controllers;

import edu.ntu.dp.models.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentSearcher {
    public List<Student> getStudentByMonth(int monthNumber) throws SQLException
    {
        List<Student> students = new ArrayList<>();
        PreparedStatement statement = DataBaseManager.getDbConnection().prepareStatement("SELECT * FROM Students WHERE MONTH(birth_date) = " + monthNumber);

        ResultSet result = statement .executeQuery();

        while (result.next())
        {
            String[] fio = result.getString("fio").split(" ");
            SudentCreator student = new SudentCreator();
            students.add(student.createStudent(result.getInt("id"),
                    fio[0],
                    fio[1],
                    fio[2],
                    result.getDate("birth_date"),
                    result.getInt("record_book_id")));
        }

        result.close();
        statement.close();

        return students;
    }


}
