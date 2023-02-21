package com.MyCompany.StudentManagementPortal;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer,Student> db= new HashMap<>(); //database where key is admissionNp
    Map<String,Student> db1 = new HashMap<>();// database where key is name

    // using name,get details
    @GetMapping("/get_infobyName")
    Student getStudentByName(@RequestParam("q") String name){
        return db1.get(name);
    }
    @PostMapping("/add")
    String addStudentByName(@RequestBody() Student student){
        db1.put(student.getName(),student);
        return "Student is added successfully";
    }

    @DeleteMapping("/deleteName/{q}")
    String deleteStudent(@PathVariable("q") String name){
        db1.remove(name);
        return "Student Deleted";

    }

   // using admissionNo, get details
    @GetMapping("/get_info")  //get information by admissionNo
   Student getStudent(@RequestParam("q") int admissionNo){
        return db.get(admissionNo);
    }

    @PostMapping("/add")
    String addStudent(@RequestBody() Student student){
        db.put(student.getAdmissionNo(),student);
        return "Student is added successfully";

    }

    @DeleteMapping("/delete/{q}")
    String deleteStudent(@PathVariable("q") int admissionNo){
        db.remove(admissionNo);
        return "Student Deleted";

    }

    // update student based on admissionNo

    @PutMapping("/Update")
    String updateStudnet(@RequestParam("q1") int first,@RequestParam("q2") int second){
         Student temp=db.get(first);
         db.put(first,db.get(second));
         db.put(second,temp);
         return "Students are updated";

    }
}
