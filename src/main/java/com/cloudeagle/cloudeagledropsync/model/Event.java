package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    private String timestamp;
    private EventCategory eventCategory;
    private EventType eventType;
    private EventDetails details;
    private Actor actor;
    private Origin origin;
}

