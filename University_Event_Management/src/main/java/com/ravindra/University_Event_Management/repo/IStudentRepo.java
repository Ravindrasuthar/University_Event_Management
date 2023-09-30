package com.ravindra.University_Event_Management.repo;

import com.ravindra.University_Event_Management.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<StudentModel,Integer> {
}
