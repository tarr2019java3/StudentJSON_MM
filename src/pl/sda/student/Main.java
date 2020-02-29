package pl.sda.student;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
        try {
            objectMapper1.writeValue(new File("student.json"), student1);
            objectMapper1.writeValue(new File("student.json"), student2);
            objectMapper1.writeValue(new File("student.json"), student3);
            objectMapper1.writeValue(new File("student.json"), student4);
            objectMapper1.writeValue(new File("student.json"), student5);
            objectMapper1.writeValue(new File("student.json"), student6);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}