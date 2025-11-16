package com.cloudeagle.cloudeagledropsync.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    private String timestamp;
    @JsonProperty("event_category")
    private TagWrapper eventCategory;
    @JsonProperty("event_type")
    private EventType eventType;
    private EventDetails details;
    private Actor actor;
    private Origin origin;
    @JsonProperty("involve_non_team_member")
    private Boolean involveNonTeamMember;
    private Actor.User context;
}

