package com.cloudeagle.cloudeagledropsync.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberName {
    @JsonProperty("given_name")
    private String givenName;
    private String surname;
    @JsonProperty("familiar_name")
    private String familiarName;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("abbreviated_name")
    private String abbreviatedName;
}

