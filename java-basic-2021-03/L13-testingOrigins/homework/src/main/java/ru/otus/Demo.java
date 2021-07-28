package ru.otus;

import ru.otus.db.EventsDb;
import ru.otus.db.InMemoryEventsDb;
import ru.otus.service.ConsoleServiceLogger;
import ru.otus.service.EventsService;
import ru.otus.service.ServiceLogger;

public class Demo {
    public static void main(String[] args) {
        ServiceLogger serviceLogger = new ConsoleServiceLogger();
        EventsDb eventsDb = new InMemoryEventsDb();
        EventsService eventsService = new EventsService(eventsDb, serviceLogger);

        System.out.println(eventsService.mergeTwoCloseEvents(1, 2));
    }
}
