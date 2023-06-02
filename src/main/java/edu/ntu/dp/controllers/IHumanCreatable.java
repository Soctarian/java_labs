package edu.ntu.dp.controllers;

import edu.ntu.dp.models.Gender;

public interface IHumanCreatable<T> {
    T create(String firstName, String secondName, String fatherName, Gender gender);
    T createDefault();
}
