package com.cloudeagle.cloudeagledropsync.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private MemberProfile profile;
    private MemberRole role;
    @JsonProperty("joined_on")
    private String joinedOn;
}

