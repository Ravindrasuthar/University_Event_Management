package com.ravindra.University_Event_Management.controller;

import com.ravindra.University_Event_Management.model.EventModel;
import com.ravindra.University_Event_Management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("add/event")
    public String AddEvent(@RequestBody EventModel eventModel)
    {
        return eventService.AddEvent(eventModel);
    }

    @PutMapping("update/event")
    public String UpdateEvent(@RequestBody EventModel eventModel)
    {
        return eventService.UpdateEvent(eventModel);
    }

    @GetMapping("get/all/event")
    public List<EventModel> GetAllEvent()
    {
        return eventService.GetAllEvent();
    }

    @GetMapping("get/all/event/by/date/{d}")
    public List<EventModel> GetAllEventByDate(@PathVariable LocalDate d)
    {
        return eventService.GetAllEventByDate(d);
    }

    @DeleteMapping("delete/event/by/id/{Id}")
    public String DeleteById(@PathVariable Integer Id)
    {
        return eventService.DeleteById(Id);
    }
}
