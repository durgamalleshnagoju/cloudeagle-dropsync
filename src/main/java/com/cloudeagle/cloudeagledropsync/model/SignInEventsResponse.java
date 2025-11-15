package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInEventsResponse {
    private List<Event> events;
    private String cursor;
    private Boolean hasMore;
}

