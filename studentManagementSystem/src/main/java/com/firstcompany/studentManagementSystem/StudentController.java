package com.firstcompany.studentManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController // this is the class where you return API

public class StudentController
{
    Map<Integer,Student> db= new HashMap<>();  //database
    @GetMapping("/get_info")   // this help to give endpoint  (annotation)
//    getting info through id
   Student getStudent(@RequestParam("id") int admNo) //to take variable parameter from user
   //we se requestparameter
    {
        return db.get(admNo);
    }
    @PostMapping("/add")
   String addStudent(@RequestBody() Student student)
    {
        db.put(student.getAdmNo(),student);
        return "Student has been added successfully";
    }
    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int admNo)
    {
        db.remove(admNo);
        return "Student deleted successfully";
    }
    //getting info through name...
    @GetMapping("/get_name/{name}")//getting info so getapi request
    Student getStudent(@PathVariable("name") String name){
        for(Integer i: db.keySet())
        {
            if(db.get(i).getName().equals(name))
            {
                return db.get(i);
            }
        }
        return null;
    }
    @PutMapping("/update")//getting info so getapi request
    String updateStudentName(@RequestBody() Student s){
        if(db.containsKey(s.getAdmNo())) {
            db.get(s.getAdmNo()).setName(s.getName());
            db.get(s.getAdmNo()).setAge(s.getAge());
            db.get(s.getAdmNo()).setBranch(s.getBranch());
            return "Student detailes updated";
        }
        return "no student exists with admno: "+s.getAdmNo();
    }

}
