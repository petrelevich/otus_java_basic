package ru.otus.domain;

import java.time.LocalDateTime;

public class Event {
    private final long id;
    private final LocalDateTime start;
    private final LocalDateTime end;
    private final String name;

    public Event(long id, LocalDateTime start, LocalDateTime end, String name) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                ", name='" + name + '\'' +
                '}';
    }
}
