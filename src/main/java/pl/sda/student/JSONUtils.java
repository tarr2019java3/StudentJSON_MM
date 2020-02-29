package pl.sda.student;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

import java.io.IOException;
import java.util.List;

public class JSONUtils {

public void wrtieList(String fileName, List<Student> students) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        objectMapper.writeValue(new File(fileName), students);
        } catch (IOException e) {
        e.printStackTrace();
        }

        }

public void readList(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
    try {
      Student[] students = objectMapper.readValue(new File(fileName), Student[].class);
      for(Student stu: students){
          System.out.println(stu.getName() + " " + stu.getLastname() + " " + stu.getIndex());
      }
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }


}
        }