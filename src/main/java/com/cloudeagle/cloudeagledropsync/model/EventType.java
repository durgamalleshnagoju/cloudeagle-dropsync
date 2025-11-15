package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventType {
    private String tag;
    private String description;
}

