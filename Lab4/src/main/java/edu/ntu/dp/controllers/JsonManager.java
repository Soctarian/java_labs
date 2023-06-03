package edu.ntu.dp.controllers;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.ntu.dp.models.University;

public class JsonManager {

    public void writeToJsonFile(Object object, String filePath) {


        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(object, writer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public University readFromJsonFile(String filePath) {
        University result = null;

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileReader reader = new FileReader(filePath)) {
            result = gson.fromJson(reader, University.class);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
