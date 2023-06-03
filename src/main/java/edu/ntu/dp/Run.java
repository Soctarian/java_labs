package edu.ntu.dp;
import edu.ntu.dp.controllers.UniversityCreator;
import edu.ntu.dp.models.*;
import edu.ntu.dp.controllers.*;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Objects;
import java.util.Scanner;

public class Run {
    public University createTypicalUniversity()
    {
        University university = new University();
        UniversityCreator universityCreator = new UniversityCreator();

        Collection<Student> students = createStudents(universityCreator);
        Collection<Group> groups = new ArrayList<Group>();
        Collection<Department> departments = new ArrayList<Department>();
        Collection<Faculty> faculties = new ArrayList<Faculty>();

        Group testGroup1, testGroup2 = new Group();
        testGroup1 = universityCreator.createGroup("124-20-1", getHead(), students);
        testGroup2 = universityCreator.createGroup("124-20-2", getHead(), students);
        groups.add(testGroup1);
        groups.add(testGroup2);

        Department department = universityCreator.createDepartment("Department of software and computer systems", getHead(), groups);
        departments.add(department);

        Faculty faculty = universityCreator.createFaculty("FIT", getHead(), departments);
        faculties.add(faculty);

        university = universityCreator.createUniversity("Dnipro University of Technology", getHead(), faculties);


        return university;

    }

    private Human createDefaultHuman() {

        Human human = new Human();

        human.setFirstName("FIRSTNAME");
        human.setSecondName("SECOND");
        human.setFatherName("PATRONYMIC");
        human.setGender(Gender.values()[0]);

        return human;
    }

    private Collection<Human> getHumans(int count) {
        Collection<Human> humans = new ArrayList<Human>();
        for (int i = 0; i < count; i++) {
            humans.add(createDefaultHuman());
        }
        return humans;
    }

    private Human getHead() {
        Human human = new Human();
        human = createDefaultHuman();
        return human;
    }

    private Collection<Student> createStudents(UniversityCreator universityCreator) {
        Collection<Student> students = new ArrayList<Student>();

        Collection<Human> humans = getHumans(2);

        for (Human human: humans) {
            students.add(universityCreator.create(
                    human.getFirstName(),
                    human.getSecondName(),
                    human.getFatherName(),
                    human.getGender()
            ));
        }

        return students;
    }
}


