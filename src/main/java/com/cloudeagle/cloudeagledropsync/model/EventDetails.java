package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDetails {
    private String tag;
    private Map<String, Object> additionalProperties;
}

