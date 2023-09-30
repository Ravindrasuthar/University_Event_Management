package com.ravindra.University_Event_Management.service;

import com.ravindra.University_Event_Management.model.Department;
import com.ravindra.University_Event_Management.model.StudentModel;
import com.ravindra.University_Event_Management.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;


    public String AddStudent(StudentModel s) {
        studentRepo.save(s);
        return "Student added";
    }

    public String UpdateStudentDepartment(Integer Id, Department department) {
        StudentModel s = studentRepo.findById(Id).get();
        s.setDepartment(department);
        studentRepo.save(s);
        return "department updated";
    }

    public List<StudentModel> GetAllStudent() {
        return (List<StudentModel>) studentRepo.findAll();
    }

    public StudentModel GetStudentById(Integer Id) {
        return studentRepo.findById(Id).get();
    }

    public String DeleteStudent(Integer Id) {
        studentRepo.deleteById(Id);
        return "Student Deleted";
    }
}
