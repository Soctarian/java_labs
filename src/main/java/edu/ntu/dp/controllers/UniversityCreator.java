package edu.ntu.dp.controllers;

import edu.ntu.dp.models.Faculty;
import edu.ntu.dp.models.Human;
import edu.ntu.dp.models.University;

import java.util.Collection;

public class UniversityCreator extends FacultyCreator{
    public University createUniversity(String universityName, Human rector, Collection<Faculty> faculties)
    {
        University university = new University();

        university.setUniversityName(universityName);
        university.setRector(rector);
        university.setFaculties(faculties);

        return university;
    }

    public University createDefaultUniversity()
    {
        University university = new University();

        university.setUniversityName("UNIVERSITY_NAME");
        university.setRector(new HumanCreator().createDefault());
        university.setFaculties(new FacultyCreator().createDefaultFacultyCollection());

        return university;
    }

}
