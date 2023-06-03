package edu.ntu.dp.models;

public class Student extends Human {
    private Group group;

    public  Group getGroup()
    {
        return group;
    }
    public  void setGroup(Group group)
    {
        this.group = group;
    }
}
