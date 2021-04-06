package com.riesgo.Analisis.service.implmentation;

import com.riesgo.Analisis.model.Event;
import com.riesgo.Analisis.repository.EventRepository;
import com.riesgo.Analisis.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EventServiceImplementation implements EventService {
    @Autowired
    EventRepository eventRepository;

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> getEventsById(String idEvent) {
        return eventRepository.findById(idEvent);
    }

    @Override
    public String saveEvent(Event event) {
        eventRepository.save(event);
        return "Event was saved";
    }

    @Override
    public String deleteEventsById(String idEvent) {
        eventRepository.deleteById(idEvent);
        return "Event was delete";
    }


}

