package com.ravindra.University_Event_Management.repo;

import com.ravindra.University_Event_Management.model.EventModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<EventModel, Integer> {
    List<EventModel> findByd(LocalDate d);

}
