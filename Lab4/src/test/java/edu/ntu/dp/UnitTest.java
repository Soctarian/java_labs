package edu.ntu.dp;

import edu.ntu.dp.controllers.JsonManager;
import edu.ntu.dp.Run;
import edu.ntu.dp.models.University;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

    @org.junit.jupiter.api.Test
    public void universityToJson() {
        Run run = new Run();
        University oldUniversity = run.createTypicalUniversity();

        JsonManager jsonManager = new JsonManager();
        jsonManager.writeToJsonFile(oldUniversity, "D:\\oldUniversity.json");

        University newUniversity = jsonManager.readFromJsonFile("D:\\oldUniversity.json");

        assertEquals(newUniversity, oldUniversity);
    }

}
