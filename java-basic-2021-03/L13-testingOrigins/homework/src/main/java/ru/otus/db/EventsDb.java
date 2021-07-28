package ru.otus.db;

import ru.otus.domain.Event;

public interface EventsDb {
    Event findById(long id);
    void saveEvent(Event event);
    void deleteEventById(long id);
}
