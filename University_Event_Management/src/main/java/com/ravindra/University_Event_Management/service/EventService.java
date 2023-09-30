package com.ravindra.University_Event_Management.service;

import com.ravindra.University_Event_Management.model.EventModel;
import com.ravindra.University_Event_Management.repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {

    @Autowired
    IEventRepo eventRepo;

    public String AddEvent(EventModel eventModel) {
        eventRepo.save(eventModel);
        return "event added";
    }

    public String UpdateEvent(EventModel eventModel) {
        eventRepo.save(eventModel);
        return "event updated";
    }

    public List<EventModel> GetAllEvent() {
        return (List<EventModel>) eventRepo.findAll();
    }

    public String DeleteById(Integer Id) {
        eventRepo.deleteById(Id);
        return "Event deleted";
    }

    public List<EventModel> GetAllEventByDate(LocalDate d) {
        return eventRepo.findByd(d);
    }
}
