package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", 32); //serializacja - przeksztalcenie obiektu
        // serializujemy do formatu JASON

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("student.json"), student1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
