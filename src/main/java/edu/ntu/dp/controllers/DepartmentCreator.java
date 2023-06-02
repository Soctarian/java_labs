package edu.ntu.dp.controllers;

import edu.ntu.dp.models.Department;
import edu.ntu.dp.models.Group;
import edu.ntu.dp.models.Human;
import edu.ntu.dp.models.Student;

import java.util.ArrayList;
import java.util.Collection;

public class DepartmentCreator extends GroupCreator {
    public Department createDepartment(String departmentName, Human headOfDepartment, Collection<Group> groups)
    {
        Department department = new Department();

        department.setDepartmentName(departmentName);
        department.setHeadOfDepartment(headOfDepartment);
        department.setGroups(groups);

        return department;
    }

    public Department createDefaultDepartment()
    {
        Department department = new Department();

        department.setDepartmentName("DepartmentName");
        department.setHeadOfDepartment(new HumanCreator().createDefault());
        department.setGroups(new GroupCreator().createDefaultGroupCollection());

        return department;
    }

    public Collection<Department> createDefaultDepartmentCollection()
    {
        Collection<Department> defaultDepartmenttCollection = new ArrayList<>();
        for (int i = 0; i < 6; i++) defaultDepartmenttCollection.add(createDefaultDepartment());
        return defaultDepartmenttCollection;
    }

}
