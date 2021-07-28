package ru.otus.db;

import ru.otus.domain.Event;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.HashMap;
import java.util.Map;

public class InMemoryEventsDb implements EventsDb {

    private final Map<Long, Event> eventMap;

    public InMemoryEventsDb() {
        eventMap = new HashMap<>();
        generateInitialData();
    }


    @Override
    public Event findById(long id) {
        return eventMap.get(id);
    }

    @Override
    public void saveEvent(Event event) {
        eventMap.put(event.getId(), event);
    }

    @Override
    public void deleteEventById(long id) {
        eventMap.remove(id);
    }

    private void generateInitialData(){
        var startTime = LocalDateTime.of(2021, 2, 2, 6, 0);
        for (int i = 1; i < 6; i++) {
            var endTime = startTime.plus(30, ChronoUnit.MINUTES);
            var event = new Event(i, startTime, endTime, "Event" + i);
            eventMap.put(event.getId(), event);
            startTime = endTime;
        }
    }
}
