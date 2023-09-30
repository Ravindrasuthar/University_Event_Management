package com.ravindra.University_Event_Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "event")
public class EventModel {

    @Id
    private int eventId;

    private String eventName;
    private String locationOfEvent;
    private LocalDate d;
    private LocalTime s;
    private LocalTime e;
}
