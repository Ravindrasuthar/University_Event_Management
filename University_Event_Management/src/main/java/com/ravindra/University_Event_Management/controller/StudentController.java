package com.ravindra.University_Event_Management.controller;

import com.ravindra.University_Event_Management.model.Department;
import com.ravindra.University_Event_Management.model.StudentModel;
import com.ravindra.University_Event_Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("add/student")
    public String AddStudent(@RequestBody StudentModel s)
    {
        return studentService.AddStudent(s);
    }

    @PutMapping("update/student/{Id}/{department}")
    public String UpdateStudentDepartment(@PathVariable Integer Id, @PathVariable Department department)
    {
        return studentService.UpdateStudentDepartment(Id,department);
    }

    @GetMapping("get/all/student")
    public List<StudentModel> GetAllStudent()
    {
        return studentService.GetAllStudent();
    }

    @GetMapping("get/student/by/id/{Id}")
    public StudentModel GetStudentById(@PathVariable Integer Id)
    {
        return studentService.GetStudentById(Id);
    }

    @DeleteMapping("delete/student/by/id/{Id}")
    public String DeleteStudent(@PathVariable Integer Id)
    {
        return studentService.DeleteStudent(Id);
    }
}
