package pl.sda.student;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", 32); //serializacja - przeksztalcenie obiektu
        // serializujemy do formatu JASON

        Student student2 = new Student("Lukasz", "Lukaszsz", 30);
        Student student3 = new Student("Bartek", "Major", 29);
        Student student4 = new Student("Grzesiek", "Dudek", 40);
        Student student5 = new Student("Pawel", "Wojak", 20);
        Student student6 = new Student("Dawid", "Gabrys", 15);


        ObjectMapper objectMapper1 = new ObjectMapper();

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        try {
            objectMapper1.writeValue(new File("student1.json"), student1);
            objectMapper1.writeValue(new File("student2.json"), student2);
            objectMapper1.writeValue(new File("student3.json"), student3);
            objectMapper1.writeValue(new File("student4.json"), student4);
            objectMapper1.writeValue(new File("student5.json"), student5);
            objectMapper1.writeValue(new File("student6.json"), student6);
            objectMapper1.writeValue(new File("studentList.json"), studentList);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.wrtieList("lista.json", studentList);
    }

}