package com.riesgo.Analisis.service;

import com.riesgo.Analisis.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> getAllEvents();
    Optional<Event> getEventsById(String idEvent);
    String saveEvent(Event event);
    String deleteEventsById(String idEvent);
}
