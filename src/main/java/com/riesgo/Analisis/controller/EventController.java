package com.riesgo.Analisis.controller;

import com.riesgo.Analisis.model.Event;
import com.riesgo.Analisis.service.implmentation.EventServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    EventServiceImplementation eventServiceImplementation;

    @GetMapping
    public List<Event> getAllEvents(){
        return eventServiceImplementation.getAllEvents();
    }

    @GetMapping("/{idEvent}")
    public Optional<Event> getEventsById(@PathVariable String idEvent){
        return eventServiceImplementation.getEventsById(idEvent);
    }

    @PostMapping
    public String saveEvents(@RequestBody Event event){
        return eventServiceImplementation.saveEvent(event);
    }

    @DeleteMapping("/{idEvent}")
    public String deleteEvent(@PathVariable String idEvent){
        return eventServiceImplementation.deleteEventsById(idEvent);
    }



}
