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
        Scanner scanner = new Scanner(System.in);
        System.out.print("DO YOU WANNA CREATE DEFAULT UNIVERSITY UNIT? (y/n): ");

        String method = scanner.nextLine();

        if (Objects.equals(method, "y")) {
            university = universityCreator.createDefaultUniversity();

        } else if (Objects.equals(method, "n")) {
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
        }
        else {
            System.out.println("METHOD ERROR");
        }

        return university;

    }

    private Human createHuman() {
        System.out.println("ENTER HUMAN INFO: FIRST NAME, SECOND NAME, PATRONYMIC, GENDER (1,2) ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        String fatherName = scan.nextLine();
        int gender = scan.nextInt() - 1;

        Human human = new Human();

        human.setFirstName(firstName);
        human.setSecondName(secondName);
        human.setFatherName(fatherName);
        human.setGender(Gender.values()[gender]);

        return human;
    }

    private Collection<Human> getHumans() {
        Collection<Human> humans = new ArrayList<Human>();
        System.out.println("ENTER NUMBER OF HUMANS: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            humans.add(createHuman());
        }

        return humans;
    }

    private Human getHead() {
        Human human = new Human();
        human = createHuman();
        return human;
    }

    private Collection<Student> createStudents(UniversityCreator universityCreator) {
        Collection<Student> students = new ArrayList<Student>();

        Collection<Human> humans = getHumans();

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


