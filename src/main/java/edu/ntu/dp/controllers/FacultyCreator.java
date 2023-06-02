package edu.ntu.dp.controllers;

import edu.ntu.dp.models.Department;
import edu.ntu.dp.models.Faculty;
import edu.ntu.dp.models.Human;

import java.util.ArrayList;
import java.util.Collection;

public class FacultyCreator extends DepartmentCreator {
    public Faculty createFaculty(String facultyName, Human dean, Collection<Department> departments)
    {
        Faculty faculty = new Faculty();

        faculty.setFacultyName(facultyName);
        faculty.setDean(dean);
        faculty.setDepartments(departments);

        return faculty;
    }

    public Faculty createDefaultFaculty()
    {
        Faculty faculty = new Faculty();

        faculty.setFacultyName("FACULTY_NAME");
        faculty.setDean(new HumanCreator().createDefault());
        faculty.setDepartments(new DepartmentCreator().createDefaultDepartmentCollection());

        return faculty;
    }

    public Collection<Faculty> createDefaultFacultyCollection()
    {
        Collection<Faculty> defaultFacultyCollection = new ArrayList<>();
        for (int i = 0; i < 6; i++) defaultFacultyCollection.add(createDefaultFaculty());
        return defaultFacultyCollection;
    }

}
